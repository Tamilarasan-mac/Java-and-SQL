package Set_Interface;
import java.util.Set;
import java.util.TreeSet;
                                                 // null not allowed , exception throw
public class Tree_Set {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Python");                      //Sorted order
        set.add("Java");
        set.add("JavaScript");
        set.add("SQL");
        set.add("Java");                        //Duplicate not allowed


        System.out.println(set);

    }
}
