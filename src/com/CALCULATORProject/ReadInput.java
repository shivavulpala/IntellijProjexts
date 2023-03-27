package com.CALCULATORProject;

import java.util.Scanner;

public class ReadInput {
public static String read()//simple static method read
{
    Scanner scanner=new Scanner(System.in);//scanner class to take input from user, command line arguments
    System.out.println("Input string (4+5*3/2)");
    String inputLine=scanner.nextLine();//whatever user enters from commandline is stored in inputLine
    scanner.close();
    return inputLine;//this inputLine string goes back to inputExp in MainApp.
}
}
