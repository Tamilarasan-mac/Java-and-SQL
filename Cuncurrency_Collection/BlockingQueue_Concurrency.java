package Cuncurrency_Collection;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue_Concurrency {
    public static void main(String[] args) throws Exception {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        queue.put(10);
        queue.put(20);  //Queue full here
        queue.put(30);  //Producer wait here

        // queue.put(40); // waits until space available // Space is capacity

        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());


    }
}