package com.recurrsion;

public class FactorialForLoop {
    public static void main(String[] args) {
        int fact=1;
        int n=6;
        for (int i = 1; i <= n; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}



