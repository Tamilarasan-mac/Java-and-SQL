package Set_Interface;
import java.util.HashSet;
import java.util.Set;               //Fast Performance

public class Hash_Set
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);    //Duplicate value not allowed
        set.add(30);
        set.add(null);  //One null value allowed

        System.out.println(set); //No order maintain
    }
}

