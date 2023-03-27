package com.exceptions;
//unchecked exceptions/runtime exceptions
public class SimpleException {
    public static void main(String[] args) {
       int x=100/0;//divide by 0, arithmetic exception
        String a=null;
        System.out.println(a.charAt(0));//null pointer exception
    }
}
