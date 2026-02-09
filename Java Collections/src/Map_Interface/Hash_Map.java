package Map_Interface;

import java.util.Map;
public class Hash_Map {
    public static void main(String[] args) {

        Map<Integer , String> map = new java.util.HashMap<>();

            map.put(101 ,"U20CA2114");      //Key -> value , this is map interface rule
            map.put(102 ,"Tamil");          // Keys and values are object
            map.put(103 ,"Hindi");          //Orders depends and map implementation
            map.put(103,"King");            //103 value is Overwrites or old value replaced
            map.put(null,"TwoK");           //one null key allowed
            map.put(104,null);              //null values allowed
            map.put(105,null);
            map.put(106,null);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());  // output = key + value
        }
    }
}

// No order maintain
// Duplicate key not allowed
// No thread safe
//duplicate key not allowed
