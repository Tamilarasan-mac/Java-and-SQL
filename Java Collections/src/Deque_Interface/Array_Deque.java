package Deque_Interface;
                                //Queue behaviour FIFO
import java.util.Deque;         //Stack behaviour LIFO
import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
                                                    //Similarly queue
        Deque<Integer> dq = new ArrayDeque<>();     //But Both ends Add & Remove
                                                    // offerFirst() for safe add front & offerLast() for safe add last
        // Add elements                             // pollFirst() safe front remove & polllast() safe last remove
        dq.addFirst(10);   // front              //peekFirst() to see first
        dq.addLast(20);    // rear               //peekLast() to see last
        dq.addFirst(5);    // front
        dq.addLast(30);    // rear

        System.out.println("Deque: " + dq);

        // Peek elements
        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());

        // Removed elements
        System.out.println("Removed First: " + dq.pollFirst());
        System.out.println("Removed Last: " + dq.pollLast());

        System.out.println("Deque after removal: " + dq);
    }
}