package Hashtable_Map_Implementation_ThreadSafe;
import java.util.Hashtable;             //legacy                 //Synchronized
public class HashTable {               //Slower tha Hashmap     //null key not allowed
    public static void main(String[] args) {                    //null value not alllowed
        Hashtable<Integer , String> ht = new Hashtable<>();

        ht.put(2114,"Tamil");
        ht.put(2115,"Tamilarasan");             //No order
        ht.put(2116,"Thiru");
        ht.put(2117,"Ansari");

        ht.put(2117,"ThamemulAnsari");// Old value replaced

        for (var entry : ht.entrySet()) {   //iterable Hashtable loop Using entryset()
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }
    }
}
