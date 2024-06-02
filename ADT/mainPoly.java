package ADT;

public class mainPoly {
    public static void main(String[] args) throws NegativeExponentException {
        Poly p = new Poly(3, 4);
        Poly q = new Poly(3, 4);
        System.out.println("coucou");
        System.out.println(p.equals(q)); // FALSE car mutable et différent référencement
    }
}
