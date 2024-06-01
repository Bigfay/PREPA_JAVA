package ADT;

class main_ADT_2{

    public static void main(String[] args) {
        ImmuMultiSet coucou = new BaseImmuMultiSet();
        coucou=coucou.insert(5);
        coucou=coucou.insert(22);
        coucou=coucou.insert(17);
        coucou=coucou.insert(5);

        System.out.println(coucou.size());
        coucou =coucou.remove(17);
        System.out.println(coucou.isIn(5));
        System.out.println(coucou.isIn(27));
        System.out.println(coucou.isIn(3));
        System.out.println(coucou.choose());
        System.out.println(coucou.numberOfOccurence(22));
        System.out.println(coucou.toString());
    }
}