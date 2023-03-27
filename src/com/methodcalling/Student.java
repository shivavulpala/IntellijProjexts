package com.methodcalling;

public class Student {//Student class
    //attributes of student class
    String name;
    int age;
    String address;
    //student class constructor
    public Student(String name, int age, String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
//getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
