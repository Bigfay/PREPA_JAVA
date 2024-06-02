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

/* 
 * 
 */
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
         * index0f fournit -1 comme réponse cela veut dire que l'élément de fait pas
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

}