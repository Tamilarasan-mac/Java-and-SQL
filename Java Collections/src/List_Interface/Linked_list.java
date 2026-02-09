package List_Interface;
                                        //Slow in get() (O(n))
import java.util.Iterator;              //Fast in remove()
import java.util.LinkedList;            //Node Structure * previous node address *next node address
import java.util.List;                  //10 -> 20 -> 30    40 ->     (Memory not continuous)
                                        //  <-    <-    <-      <-

public class Linked_list {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>();

        list.add("Tamil");
        list.add("King");
        list.add("Sk");
        list.add(null);             //null values allowed
        list.add(null);
        list.add(null);

        List<String> list2=new LinkedList<>();

        list2.add("Dinesh");
        list2.add("Ak");
        list2.add("Akash");

        list.addAll(list2);         //addAll method , now list and list2 was multiple added

        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }


    }
}
