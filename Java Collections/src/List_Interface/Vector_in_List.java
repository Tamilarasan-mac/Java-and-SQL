package List_Interface;

import java.util.Vector;
                            //Similar to Arraylist
import java.util.Iterator;  //But vector is synchronized (thread safe) Multi thread app
                            //Slow performance ,because synchronized
public class Vector_in_List {
    public static void main(String []args){     //insertion order
                                                //index based
        Vector<String> v2 = new Vector<>();
            v2.add("Tamil");
            v2.add("King");
            v2.add("Tamil");    //Duplicate value allowed
            v2.add("king");     //Duplicate value allowed
            v2.add("Two K");
            v2.add(null);       // null values allowed
            v2.add(null);
            v2.add(null);

Iterator<String> it = v2.iterator();
while(it.hasNext()) {
                                        //Thread Safe
    System.out.println(it.next());
}
    }
}