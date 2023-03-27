package com.staticdemo;

public class StaticDemo {
    public static void main(String[] args) {
        Student john=new Student("Shiva", 30, "1597 S Foothill Dr");
        //below 3 are accessed using instance nothing but obj
        System.out.println(john.name);
        System.out.println(john.age);
        System.out.println(john.address);
        System.out.println(Student.college);//Static variables can be accessed only using cls name but not obj name
        //System.out.println(Student.count);
    }
}
