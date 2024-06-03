package ADT;

import java.util.ArrayList;
import java.util.List;

/**
 * @overview Les IntSets sont des ensembles non bornés d’entiers.
 *           Ils sont mutables.
 *           De manière générale, un IntSet est défini comme {x1, x2,...,xn}
 *           où chaque xi est un int (pour 1 <= i <= n)
 * @derivedfield size=#this
 * @invariant size >= 0
 */

// FA(c) = {c.els.get(i) | 0 <= i < c.els.size()}

// L’invariant de rep est :
// c.els ≠ null &&
// il n’y a pas de doublons dans c.els

public class IntSet {
    // La représentation
    private List<Integer> els;

    // Constructeurs
    /**
     * @effects initialise this à l'ensemble vide
     */
    public IntSet() {
        els = new ArrayList<>();
    }

    // Méthodes
    /**
     * @modifies this
     * @effects this_post = this U {x}
     */

    public void insert(int x) {
        /*
         * indexOf fournit -1 comme réponse cela veut dire que l'élément de fait pas
         * partie de la liste c'est pour cela que l'on test < 0
         * c'est comme cela que pour le add on respecte l'unicité des éléments
         */

        if (els.indexOf(x) < 0) {
            els.add(x);
        }
    }

    /**
     * @modifies this
     * @effects this_post this \ {x}
     */
    public void remove(int x) {
        els.remove((Object) x);
    }

    /**
     * @return true lorsque x est dans this; renvoit false sinon
     */
    public boolean isIn(int x) {
        /* on aurait pu utiliser indexOf c'est tout à fait équivalent à contains */
        return els.contains(x);
    }

    /**
     * @return size
     */
    public int size() {
        return els.size();
    }

    /**
     * @throws EmptyException si this est vide
     * @return x tel que x appartient à this, sinon
     */
    public int choose(int i) throws EmptyException {
        if (els.size() == 0) {
            throw new EmptyException("IntSet.choose()");
        }
        return els.get(0);
    }

    /**
     * @effects crée une copie de c
     */
    public IntSet(IntSet c) { // Il s'agit d'une deep copy parce que InSet est MUTABLE un shallow copy aurait
                              // provoquer un partage de référence
        els = new ArrayList<>();
        for (Integer i : c.els) {
            els.add(i);
        }
    }

    public String toString() {
        if (els.size() == 0) {
            return "IntSet:{}";
        }
        StringBuilder s = new StringBuilder("IntSet: {" +
                els.get(0));
        for (int i = 1; i < els.size(); i++) {
            s = s.append(" , " + els.get(i));
        }
        return s.append("}").toString();
    }

    public boolean repOK() {
        if (els == null)
            return false;
        for (int i = 0; i < els.size(); i++) {
            Integer x = els.get(i);
            for (int j = i + 1; j < els.size(); j++) {
                if (x.equals(els.get(j)))
                    return false;
            }
        }
        return true;
    }

}