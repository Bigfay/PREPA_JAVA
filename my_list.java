import java.util.ArrayList;
import java.util.List;

public class my_list {
    List<String> ma_liste = new ArrayList<>();

    public my_list() {
        ma_liste.add("def");
        ma_liste.add("abc");
    }

    public String mon_index() {
        return ma_liste.get(0);
    }

    public void mon_index_set(String z) {
        ma_liste.set(0, z);
    }
}
