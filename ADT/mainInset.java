package ADT;

public class mainInset {
    public static void main(String[] args) {
        IntSet s = new IntSet();
        IntSet t = new IntSet();
        s.insert(3);
        t.insert(3);
        System.out.println("coucou");
        System.out.println(s.equals(t)); // False car mutable et différent référencement
        System.out.println(s.toString());
    }

}
