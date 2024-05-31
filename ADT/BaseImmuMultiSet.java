package ADT;

import java.util.ArrayList;

public class BaseImmuMultiSet implements ImmuMultiSet {
    // REP
    private ArrayList<Integer> set = new ArrayList<>();

    /**
     * @effects : initialise this à vide
     */
    public BaseImmuMultiSet() {

    }

    public BaseImmuMultiSet insert(int i) {
        BaseImmuMultiSet newSet = new BaseImmuMultiSet(this);
        newSet.set.add(i);
        return newSet;
    }

    public BaseImmuMultiSet remove(int i) {
        BaseImmuMultiSet newSet = new BaseImmuMultiSet(this);
        while (newSet.isIn(i)) {
            newSet.set.remove((Integer) i);
            // il efface au fur et à mesure tant qu'il trouve des occurences
        }
        return newSet;
    }

    public boolean isIn(int i) {
        return set.contains(i);
    }

    public int size() {
        return set.size();
    }

    public int numberOfOccurence(int i) {
        int occurences = 0;
        for (Integer s : set) {
            if (s == i)
                occurences++;
        }
        return occurences;
    }

    public int choose() {
        return set.get(0);
    }

    /**
     * @effects crée une copie de bim (BaseImmuMultiSet)
     *          sans ça les méthodes ci-dessus ne fonctionnent pas car rien n'est
     *          disponible avec bim
     *          en entrée pour créer une copie du multiset
     */

    public BaseImmuMultiSet(BaseImmuMultiSet bim) {
        set = new ArrayList<>();
        for (Integer elt : bim.set) {
            set.add(elt);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{}");
        if (this.size() == 0) {
            return "{}";
        }
        for (Integer i : this.set) {
            s.append(i + ",");
        }
        s.replace(s.length() - 1, s.length(), "}");
        return s.toString();

    }
}
