package com.CALCULATORProject;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class MainApp {
    public static void main(String[] args) {
        final String inputExp=ReadInput.read();//readinput class which is calling a read method,
        // from ReadInput class read method the string stored in inputLine is retrieved and stored in inputExp

        Queue<String> operations;
        Queue<String> numbers;
//4+5*3/2
        //here we are using split method of string api to separate numbers and operations into 2diff string arrs
        String numArr[]=inputExp.split("[-+*/]");//holding numbers no math expressions
        String operArr[]=inputExp.split("[0-9]+");//holding only math operators

        //converting string array into queue
        numbers=new LinkedList<String>(Arrays.asList(numArr));//converting array into list,
        // then converting normal list into a LinkedList, then storing LL in Queue of numbers.
        operations=new LinkedList<String>(Arrays.asList(operArr));

        //poll method of Q is used when u want to fetch head/first element of Q
        Double res=Double.parseDouble(numbers.poll());//res has first number of expression

        //run this loop until numbers queue is not empty
        while(!numbers.isEmpty())
        {
            String opr=operations.poll();//pickup first operator
            Operate operate;//defined reference/type of interface Operate

            switch(opr)//to choose an operator
            {
                case "+":
                    operate=new Add();//dyn binding:assigning obj type to interface type, obj type depends on exp
                    break;
                case "-":
                    operate=new Subtract();
                    break;
                case "*":
                    operate=new Multiply();
                    break;
                case "/":
                    operate=new Divide();
                    break;
                default:
                    continue;
            }
            Double num=Double.parseDouble(numbers.poll());//to fetch next values in the number queue
            res=operate.getResult(res,num);
        }
        System.out.println(res);
    }
}
