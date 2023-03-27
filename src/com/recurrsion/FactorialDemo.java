package com.recurrsion;

public class FactorialDemo {
    public static void main(String[] args) {
        ComplexFunction complexFunction=new ComplexFunction();
        int result=ComplexFunction.factorial(5);
        System.out.println(result);
    }
}
