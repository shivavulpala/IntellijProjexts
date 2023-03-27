package com.example;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[])
    {
        TreeMap<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(5,"D");
        treeMap.put(3,"A");
        treeMap.put(2,"B");
        treeMap.put(1,"C");
        System.out.println(treeMap);

        TreeMap<String,Integer> treeMap1=new TreeMap<>();
        treeMap1.put("D",5);
        treeMap1.put("A",3);
        treeMap1.put("C",2);
        treeMap1.put("B",1);
        System.out.println(treeMap1);

    }
}
