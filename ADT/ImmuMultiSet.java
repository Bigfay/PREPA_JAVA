package ADT;

/**
 * @overview
 *           Les ImmuMultiSets sont des ensembles non bornés d'entiers qui
 *           peuvent contenir des doublons.
 *           Ils sont immutables.
 *           De manière générale,un ImmuMultiSet est défini comme{x1,...,xn}
 *           où x1,...,xn sont de sentiers.Ex:{2,9,5,5,19}
 * @invariants size=#this
 */

public interface ImmuMultiSet {
    // Type immutable ==> toute méthode qui modifie un objet un immuMultiSet
    // doit en retourner une nouvelle instance

    /**
     * @return un nouveau ImmuMultiSet équivalent à this U {i}
     */
    public ImmuMultiSet insert(int i);

    /**
     * @return un nouveau ImmuMultiSet équivalent à this \ {i}
     */
    public ImmuMultiSet remove(int i);

    /**
     * @return true sii appartient à this, sinon false
     */

    public boolean isIn(int i);

    /**
     * @return le nombre d'élément de mon ImmuMultiSet
     */
    public int size();

    /**
     * @requires i appartient à this
     * @return retourne le nombre d'occurences de i
     */
    public int numberOfOccurence(int i);

    /**
     * @requires this est non vide
     * @return retourne un élément de this
     */
    public int choose();

}
