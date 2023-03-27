package com.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String args[])
    {
        Set<String> hashSet;
        hashSet= new HashSet<String>();

        hashSet.add("A");
        hashSet.add("B");

        boolean r1=hashSet.add("C");
        System.out.println(r1);
        boolean r2=hashSet.add("C");
        System.out.println(r2);
        hashSet.add("C");
        hashSet.add("C");

        System.out.println(hashSet);

        System.out.println(hashSet.contains("C"));

        hashSet.remove("A");
        System.out.println(hashSet);

        for(String item:hashSet)
        {
            System.out.println(item);
        }
    }
}
