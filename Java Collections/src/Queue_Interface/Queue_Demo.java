package Queue_Interface;

import java.util.*;                                      //Queue is FIFO concept - First In First Out
public class Queue_Demo {
   ; public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();                //offer = for add element
        queue.add("Dinesh");                                     //poll = for remove element
        queue.add("Tamil King");                                 //peek = to see the top element
        queue.add("Akash");
        queue.add("Dinesh Raj");

        System.out.println("Queue:" + queue);
        System.out.println("peek:" + queue.peek());
        System.out.println("Remove:" + queue.poll());
        System.out.println("After the poll:" + queue);

        }
   }




