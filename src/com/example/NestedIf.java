package com.example;

public class NestedIf {
    public static void main(String args[])
    {
        int testscore=50;

        if(testscore==50) {
            System.out.println("Testscore is 50");

            if(testscore>40) {
                System.out.println("Testscore is greater than 40");

                if(testscore<60){
                    System.out.println("Testscore is lessthan 60");}
            }
        }
    }
}
