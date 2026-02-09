package Queue_Interface;

import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue Is Not FIFO (Fisrt In First Out)
//Sorting based
public class Priority_Queue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll()); //1st poll() smallest = 10 , output = 10
        System.out.println(pq.poll()); //2nd poll() remaining [20,30] , smallest = 20 , output = 20
        System.out.println(pq.poll()); //3rd poll() remaining [30] , output = 30



    }
}
