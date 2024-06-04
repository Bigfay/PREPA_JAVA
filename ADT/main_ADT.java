package ADT;

import javax.naming.directory.NoSuchAttributeException;

class main_ADT {

    public static void main(String[] args) {
        
        System.out.println("hello");
        try {
            throw new NoSuchAttributeException("blabla");
        } catch (NoSuchAttributeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}