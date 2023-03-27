package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class comparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        Student shiva=new Student(3,"shiva","usa");
        Student hari=new Student(1,"hari","india");
        Student sri=new Student(2,"sri","usa");
        list.add(shiva);
        list.add(hari);
        list.add(sri);
        Collections.sort(list);//java doesnt know how to sort this and it will force you to provide implementaion
        list.forEach(student ->System.out.println( student.getName()));//names get printed in sorted order
        //because of the compareto method in student class.

    }
}
