package Cuncurrency_Collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer i : list) {
            System.out.println(i);          //Only read
        }
        // Modify pannalum exception illa
        list.add(40);       //add once outside loop

        System.out.println("Final List: " + list);
    }
}