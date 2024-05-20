package APROC;

import APROC.MyKindOfException.ZeroException;

public class loc_main {
    public static void main(String[] args) {
        try {
            proc_standalone.my_sa_proc(-5);
        } catch (MyKindOfException | ZeroException e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("c'est l'exécution du finally  !!!");
        }
    }
}
