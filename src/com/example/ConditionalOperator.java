package com.example;

public class ConditionalOperator {
    public static void main(String args[])
    {
        int a=1;
        int b=2;

        if((a==1) && (b==2))
            System.out.println("a is 1 AND b is 2");

        if((a==1) || (b==3))
            System.out.println("a is 1 OR b is 3");

        if((a==1) && (b==3))
            System.out.println("a is 1 AND b is 2");

    }
}
