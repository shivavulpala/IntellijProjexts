package practice.basicprograms;

import java.util.Scanner;

public class ReadNumberFromStandardInput {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the value of i");
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of i is " +sc.nextInt());
        //OR
        System.out.println("Enter the value of i");
        i=sc.nextInt();
        System.out.println("The value of i is " +i);
    }
}
