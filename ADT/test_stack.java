package ADT;

public class test_stack {


       

    public static void main(String[] args) {

        String s = new String ("hello");
        String t = new String ("hello");
        System.out.println("s "+s.hashCode());
        System.out.println("t "+t.hashCode());
        StringBuilder sb = new StringBuilder("he");
        StringBuilder tb = sb;
        String s1 = "hello";
        String t1 = "hello";
        
        sb.append ("llo");
        tb.append (" goodbye");
        s.concat (" goodbye");
        t = s.concat (" goodbye");         
        System.out.println("hello");
        System.out.println("s "+s.hashCode());
        System.out.println("t "+t.hashCode());
    }
    
}
