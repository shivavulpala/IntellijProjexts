package com.equalshashcode;

public class Main {
    public static void main(String[] args) {
        Student shiva=new Student(10,"shiva","usa");
        Student hari=new Student(20,"hari","india");
        Student srihan=new Student(20,"srihan","usa");
        Student sriyan=new Student(30,"sriyan","usa");
        System.out.println(hari.equals(srihan));//though both the objects hold same value the
        // result turns out to be false since they have different references
        System.out.println(shiva.equals(hari));
        System.out.println(shiva.equals(sriyan));
    }
}
