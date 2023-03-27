package practice.basicprograms;

import java.util.Scanner;

public class MultiplyTwoFloatNumbers {
    public static void main(String[] args) {
        float x=5.8f;
        float y=9.3f;
        float z=x*y;
        System.out.println("Value of x*y is "+z);
        //OR using scanner cls
        float a;
        float b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a & b");
        a=sc.nextFloat();
        b= sc.nextFloat();
        float c=a*b;
        System.out.println("Result of a*b is: "+c);
    }
}
