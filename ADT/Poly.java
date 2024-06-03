package ADT;

import java.util.Arrays;

//import ADT.NegativeExponentException;

/**
 * @overview Les Poly sont des polynomes à coefficients entiers.
 *           Ils sont immutables. Donc pas de MUTATEURS
 *           De manière générale, un Poly est défini comme c0 + c1 x + c2 x^2
 *           ... + cn x^n
 *           où chaque ci est un int (pour 0 <= i <= n)
 */

// La fonction d’abstraction est
// FA(c) = c0 + c1x + c2x^2 + ...
// où
// ci = c.trms[i] si 0 <= i < c.trms.length
// = 0 sinon

// IR(c) :
// c.trms ≠ null &&
// c.trms.length >= 1 &&
// c.deg = c.trms.length-1 &&
// c.deg > 0 Þ c.trms[deg] ≠ 0

public class Poly {

    // la représentation
    private int[] trms;
    private int deg;

    // Constructeurs
    /**
     * @effects initialise this au polynome nul
     */
    public Poly() {
        /*
         * à l'initialisation du polynome, on crée un polynome de degré 0 dans un
         * tableau de taille 1 avec zero dedans
         */
        trms = new int[1];
        deg = 0;
    }

    /**
     * @throws NegativeExponentException si n < 0
     * @effects sinon, initialise this au polynome c.x^n
     */
    // overloading de la méthode poly
    public Poly(int c, int n) throws NegativeExponentException {
        if (n < 0) {
            throw new NegativeExponentException("Poly.Poly(int,int)");
        }
        if (c == 0) {
            trms = new int[1];
            deg = 0;
            return;
        }
        trms = new int[n + 1]; // quand on a un n la taille du tableau est de n+1
        // for (int i = 0; i < n; i++) {
        // trms[i] = 0;}
        /*
         * Pas nécessaire d'initialiser à 0 car c'ezst fait automatiquement lors de la
         * création d'un tableau
         */
        trms[n] = c;
        deg = n;
    }

    private Poly(int n) {
        trms = new int[n + 1];
        deg = n;
    }

    // Méthodes
    /**
     * @return renvoit le degré de this, càd le plus gand exposant non nul.
     *         Si this est le polynome nul il renvoit 0
     */
    public int degree() {
        return deg;
    }

    /**
     * @return renvoit le coefficient du terme de this d'exposant d
     */
    public int coeff(int d) {
        if (d < 0 || d > deg)
            return 0;
        else
            return trms[d];

    }

    /**
     * @throws NullPointerException si q == null
     * @return le polynome this + q, sinon
     */
    /*
     * add est un producteur donc renvoit toujours un objet du même type que
     * l'entrée donc ici de Poly vers Poly
     */
    public Poly add(Poly q) throws NullPointerException {
        Poly la, sm;
        // 3 tests pour déterminer le degré le plus grand non nul
        if (deg > q.deg) {
            la = this;
            sm = q;
        } else {
            la = q;
            sm = this;
        }
        int newdeg = la.deg; // le nouveau degré est le plus grand des 2
        if (deg == q.deg) { // sauf si les coeff des derners deg sont 0
            for (int k = deg; k > 0; k--) {
                if (trms[k] + q.trms[k] != 0) {
                    break;
                } else {
                    newdeg--;
                }
            }
        }
        Poly r = new Poly(newdeg); // crée un nouveau Poly
        int i;
        for (i = 0; i <= sm.deg && i <= newdeg; i++) {
            r.trms[i] = sm.trms[i] + la.trms[i];
        }
        for (int j = i; j <= newdeg; j++) {
            r.trms[j] = la.trms[j];
        }
        return r;

    }

    /**
     * @return size
     */
    public int size() {
        return 0;
    }

    /**
     * @throws EmptyException si this est vide
     * @return x tel que x appartient à this, sinon
     */
    public int choose(int i) {
        return 0;
    }

    /**
     * 
     * @throws NullPointerException si q == null
     * @return this * q, sinon
     */
    public Poly mul(Poly q) throws NullPointerException {
        if ((q.deg == 0 && q.trms[0] == 0) || (deg == 0 && trms[0] == 0)) {
            return new Poly();
        }
        Poly r = new Poly(deg + q.deg);
        r.trms[deg + q.deg] = 0; // prepare le calcul des coeff
        for (int i = 0; i <= deg; i++) {
            for (int j = 0; j <= q.deg; j++) {
                r.trms[i + j] = r.trms[i + j] + trms[i] * q.trms[j];
            }
        }
        return r;
    }

    /**
     * 
     * @throws NullPointerException si q == null
     * @return this - q, sinon
     */
    public Poly sub(Poly q) throws NullPointerException {
        return add(q.minus());
    }

    public Poly minus() {
        Poly r = new Poly(deg);
        for (int i = 0; i < deg; i++) {
            r.trms[i] = -trms[i];
        }
        return r;
    }

    //@overload
    public boolean equals(Poly q) { // On réimplémente equals car Poly est immutable afin de comparer les valeurs de
                                    // ces 2 instances
        if (q == null || deg != q.deg) // on compare les degrés des 2 polynomes s'ils sont différents on sait déjà que
                                       // ce ne sont pas les mêmes polynomes
            return false;
        for (int i = 0; i <= deg; i++) { // Pour finir on compare les coeficients des polynômes si c les mêmes alors
                                         // true sinon false
            if (trms[i] != q.trms[i])
                return false;
        }
        return true;
    }

    @Override
    /*
     * on compare la classe au runtime de l'object o si'il s'avère qu'il est de la
     * classe Poly on fait appelle au Poly du dessus. Au passage on cast le type
     * pour être sûr que le Poly du dessus le prenne en charge
     */
    public boolean equals(Object o) {
        if (o == null || !o.getClass().equals(getClass())) {
            return false;
        }
        return equals((Poly) o);
    }

    @Override
    public int hashCode() {
        // 2 variables à considérer ici deg et le tableau trms
        int result = 17;
        result = 31 * result + deg;
        result = 31 * result + Arrays.hashCode(trms);
        return result;
    }

    public boolean repOK() {
        if (trms == null)
            return false;
        if (trms.length == 0)
            return false;
        if (deg != trms.length - 1)
            return false;
        if (deg == 0)
            return true;
        return (trms[deg] != 0);
    }
}