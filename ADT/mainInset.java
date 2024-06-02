package ADT;

public class mainInset {
    public static void main(String[] args) {
        IntSet s = new IntSet();
        IntSet t = new IntSet();
        s.insert(3);
        t.insert(0);
        System.out.println("coucou");
        System.out.println(s.equals(t)); // FALSE car mutable et différent référencement
    }

}
