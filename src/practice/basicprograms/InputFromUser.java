package practice.basicprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) throws IOException {
        //using Scanner cls
        System.out.println("Enter some input");

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Input from user is: "+s);

        int i=sc.nextInt();
        System.out.println("Input from user is: "+i);

        float f= sc.nextFloat();
        System.out.println("Input from user is: "+f);

        //OR using Buffered Reader cls
        System.out.println("Enter some input");
        BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
        String st=BF.readLine();
        System.out.println("Input from user is: "+st);

        //OR using Command Line Arguments
//        if(args.length>0)
//        {
//            System.out.println("Command line arguments are: ");
//            for(String val:args)
//                System.out.println(val);
//        }
//        else
//            System.out.println("No command line arguments found.");

    }
}
