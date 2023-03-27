package com.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[])
    {
        Queue<String> queue=new PriorityQueue<>();//sorts objs in alphabetical order

        queue.add("India");
        queue.add("Germany");
        queue.add("America");
        System.out.println(queue);//sysout will print objects in random order

        queue.remove();
        System.out.println(queue);//will follow natural sorting order

        System.out.println(queue.peek());//to see which element is on the top

        System.out.println(queue.poll());//to remove top element/head
        System.out.println(queue);
    }
}
