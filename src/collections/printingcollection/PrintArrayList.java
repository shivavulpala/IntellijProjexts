package collections.printingcollection;

import java.util.ArrayList;

public class PrintArrayList {//user defined collection
    String name;int age;
    PrintArrayList(String n, int a)//constructor
    {
        name = n;
        age = a;
    }
    public String toString()//overriding tostring() to print collection
    {
        return "Name : " + name + " | Roll No : " + age;
    }
    public static void main(String[] args)
    {
        ArrayList<PrintArrayList> al = new ArrayList<PrintArrayList>();//arraylist for userdefined collection
        //obj creation of cls
        PrintArrayList t1 = new PrintArrayList("John", 101);
        PrintArrayList t2 = new PrintArrayList("Paul", 102);
        PrintArrayList t3 = new PrintArrayList("Jack", 103);
        PrintArrayList t4 = new PrintArrayList("Jose", 104);
        //adding objs to arraylist
        al.add(t1);
        al.add(t2);
        al.add(t3);
        al.add(t4);
        //print collection
        for (PrintArrayList p : al)
            System.out.println(p);
    }
}
