package Map_Interface;

import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String[] args) {

        Map<Integer , String> map = new java.util.LinkedHashMap<>();
        // Order same as insertion

            map.put(3, "kfc");              // Duplicate key not allowed
            map.put(1, "Dominos");          // Not thread safe
            map.put(2, "Donald");
            map.put(4, null);               //null values allowed
            map.put(5, null);
            map.put(null, "Fry");           //one null key allowed
            map.put(6, null);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue()); //Output = key + value
        }
    }
}