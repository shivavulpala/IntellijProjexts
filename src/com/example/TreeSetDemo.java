package com.example;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[])
    {
        TreeSet<String> treeSet;
        treeSet=new TreeSet<String>();
//natural ordering
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("D");//no duplicates

        System.out.println(treeSet);
    }

}
