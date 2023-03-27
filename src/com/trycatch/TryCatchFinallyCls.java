package com.trycatch;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinallyCls {
    public void writeList()
    {
        try{//used to write code which might throw exceptions
            List<Integer> list = new ArrayList<>(10);//initializing arraylist
            list.add(10);//adding item 10 at index0 of arraylist

            System.out.println("entering try block");
            Integer a=list.get(1);//accesing value at index1 and storing in a
            System.out.println("accessing first element " + a);
        }
        catch(IndexOutOfBoundsException e)//used to catch exceptions from try block
        {
            System.out.println(e.getMessage());//this msg will be printed when try to access the
            // value from diff index
        }
        finally {//usually this block is used to cleanup operations
            System.out.println("nothing to close but just to show how this will be executed");
        }
    }
}
