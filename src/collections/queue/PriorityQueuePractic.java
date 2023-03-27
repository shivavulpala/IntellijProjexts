package collections.queue;

import java.util.PriorityQueue;

public class PriorityQueuePractic {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(10);
        p.add(20);
        p.add(15);
        System.out.println(p);

        System.out.println(p.peek());
        System.out.println(p);

        System.out.println(p.poll());
        System.out.println(p);
    }
}
