package APROC;

import APROC.MyKindOfException.ZeroException;

public class proc_standalone {
    public proc_standalone() {

    }

    /**
     * @requires m entier > 0
     * @modifies none car il n'y a pas d'input modifié
     * @effects aucun effet car aucun input n'est modifié cependant impression des
     *          nombres de 0 à m-1
     * @return void
     * @throws MyKindOfException si m < 0 et ZeroException si m = 0
     * 
     */
    public static void my_sa_proc(int m) throws MyKindOfException, ZeroException {
        if (m < 0) {
            throw new MyKindOfException("m est inférieur à 0");
        }
        if (m == 0) {
            throw new MyKindOfException("m est égal à 0 !!!");
        }
        for (int i = 0; i < m; i++) {
            System.out.println(i);

        }
    }
}
