package com.example;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<>();

        stack.push("America");
        stack.push("Canada");
        stack.push("India");
        System.out.println(stack);

        String popelement=stack.pop();
        System.out.println(popelement);
        System.out.println(stack);

        String popelement2=stack.peek();
        System.out.println(popelement2);
        System.out.println(stack);
    }
}
