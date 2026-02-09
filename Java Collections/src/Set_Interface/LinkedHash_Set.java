package Set_Interface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHash_Set {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Java");       //insertion order
        set.add("Python");
        set.add("C");
        set.add(null);         //one null allowed
        set.add("C++");
        set.add("C");           //No duplicate value

        System.out.println(set);

    }

}
