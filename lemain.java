
public class lemain {
 public static void main(String[] args) {
   
intro loco = new intro();
int valeur=loco.getValeur();

   System.out.println(valeur);
   System.out.println(loco.getPint());
 
 suite locosuite = new suite();
 System.out.println(locosuite.getSeven());
 System.out.println(loco.getSeven());
 System.out.println(loco.comp1());
 System.out.println(loco.comp2());
 
}
}
