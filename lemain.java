
public class lemain {
  public static void main(String[] args) {

    intro loco = new intro();
    int valeur = loco.getValeur();

    System.out.println(valeur);
    System.out.println(loco.getPint());

    suite locosuite = new suite();
    System.out.println(locosuite.getSeven());
    System.out.println(loco.getSeven());
    System.out.println(loco.comp1());
    System.out.println(loco.comp2());

    my_list ma_liste_distante = new my_list();

    ma_liste_distante.mon_index();
    String me = ma_liste_distante.mon_index();
    System.out.println(me);
    me = me + "klm";
    ma_liste_distante.mon_index_set(me);
    System.out.println(ma_liste_distante.mon_index());
  }
}
