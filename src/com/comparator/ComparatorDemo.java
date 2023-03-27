package com.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student shiva = new Student(3, "shiva", 30);
        Student hari = new Student(1, "hari", 37);
        Student sri = new Student(2, "sri", 5);
        list.add(shiva);
        list.add(hari);
        list.add(sri);

        Collections.sort(list);//java doesnt know how to sort this and it will force you to provide implementaion
        list.forEach(student -> System.out.println(student.getName()));//names get printed in sorted order
        //because of the compareto method in student class.

        Collections.sort(list, new AgeComparator());//custom sorting
        list.forEach(student -> System.out.println(student.getAge()));
    }
    }
