package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDeo {
    public static void main(String args[])
    {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",30);

        System.out.println(map.size());
        System.out.println(map);

        if (map.containsKey("A")) {//to check if the value is present
            Integer A=map.get("A");
            System.out.println(A);
        }

        for(String key:map.keySet())//iterate over keyset and print value
        {
            System.out.println(map.get(key));
        }

        for(Entry<String,Integer> entry : map.entrySet())//iteration when we have key and value
        {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }

    }
}
