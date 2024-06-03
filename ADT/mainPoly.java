package ADT;

public class mainPoly {
    public static void main(String[] args) throws NegativeExponentException {
        Poly p = new Poly(3, 4);
        Poly q = new Poly(3, 4);
        System.out.println("coucou");
        System.out.println(p.equals(q)); // True car immutable et equals redéfini
        System.out.println(p.hashCode()); // True car la hashcode a été redéfini
        System.out.println(q.hashCode());
    }
}
