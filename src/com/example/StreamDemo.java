package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static <list> void main(String args[])
    {
        List<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        System.out.println(numberList);

         //********regular oop method for squaring numbers in list*************

//       List<Integer> squareList = new ArrayList<>();
//       for(Integer i:numberList)
//       {
//           squareList.add(i*i);
//       }

        //********stream method**********

//        List<Integer> squareList=numberList.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(squareList);

        //*******list to set conversion with squaring numbers in list - oop method**********

//        Set<Integer> squareSet=new HashSet<>();//explicitly creating a set of type hashset
//        for(Integer i:numberList)
//        {
//            squareSet.add(i*i);
//        }
//        System.out.println(squareSet);

        //*******Stream API method***********

//        Set<Integer> squareSet=numberList.stream().map(x->x*x).collect(Collectors.toSet());
//        System.out.println(squareSet);

        List<String> languages=new ArrayList<>();

        languages.add("scala");
        languages.add("java");
        languages.add("python");
        languages.add("basic");
        System.out.println(languages);

         //************oop method filtering**************

//        List<String> filterList=new ArrayList<>();
//        for(String s:languages)
//        {
//            if(s.startsWith("p"))
//            {
//                filterList.add(s);
//            }
//        }
//        System.out.println(filterList);

        //*************Stream API filtering************

//        List<String> filterList=languages.stream().filter(s->s.startsWith("j")).collect(Collectors.toList());
//        System.out.println(filterList);

        //************sorting collections using streams***********

//        List<String> sortedList=languages.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);

        //**********iterating collections using streams**********

//

        //***********reduce fucntionality of streams to sum numbers in a list***********

        int sum=numberList.stream().reduce(0,(ans,i)->ans+i);//reduce fun will return single result stored in sum var
        System.out.println(sum);
    }
}
