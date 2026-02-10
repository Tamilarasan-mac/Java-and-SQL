package Cuncurrency_Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Con_Hashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
            map.put(5, "Hibernate"); // No exception
        });
    }
}