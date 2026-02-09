package Map_Interface;

import java.security.KeyStore;
import java.util.Map;
import java.util.TreeMap;

public class Tree_map {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        // Order maintained
                                    //null key not allowed
        map.put(1, "kfc");          //Duplicate Key Not allowed
        map.put(3, "Chick");        //Not Thread Safe
        map.put(2, "NonVeg");       //Sorted Order
        map.put(4, null);           //null values allowed
        map.put(5, null);
        map.put(6,"Veg");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {       //import java.util.TreeMap
            System.out.println(entry.getKey() + " -> " + entry.getValue()); // Key + value in Output

        }
        }
    }
