package ADT;

public class test_stack {

    public static void main(String[] args) {

        String s = new String("hello");
        String t = new String("hello");
        System.out.println("s " + s.hashCode());
        System.out.println("t " + t.hashCode());
        StringBuilder sb = new StringBuilder("he");
        StringBuilder tb = sb;
        // String s1 = "hello";
        // String t1 = "hello";

        sb.append("llo");
        tb.append(" goodbye");
        s.concat(" goodbye");
        t = s.concat(" goodbye");
        System.out.println("hello");
        System.out.println("s " + s.hashCode());
        System.out.println("t " + t.hashCode());

        String monString = "abcdef";
        System.out.println(monString);
        System.out.println("Length " + monString.length());
        Object o2 = monString;
        System.out.println(o2);
        System.out.println("length of o2: " + o2.toString().length());
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        Object ostr1 = str1;
        Object ostr2 = str2;
        boolean test_string = ostr1.equals(ostr2);
        System.out.println("test string : " + test_string);

        boolean test_object = ((Object) ostr1).equals((Object) ostr2);
        System.out.println("test objet : " + test_object);
    }

}
