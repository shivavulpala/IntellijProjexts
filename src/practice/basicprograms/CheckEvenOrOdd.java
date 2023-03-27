package practice.basicprograms;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int i=10;
        if(i%2==0)
            System.out.println("i is even");
        else
            System.out.println("i is odd");
        //or
        int x;
        System.out.println("Enter the value of x:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("User input is:" +x);
        if(x%2==0)
            System.out.println("x is even");
        else
            System.out.println("x is odd");
    }

}
