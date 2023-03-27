package com.staticdemo;

public class Student {
    String name;
    int age;
    String address;
    static String college="XYZ";//static variable, can be accessed anywhere with cls name
    static int count=0;//static variable to show how static method works. can be accessed by static method
    // only when declared as static

    public Student(String Name, int Age, String Address)
    {
        this.name=Name;
        this.age=Age;
        this.address=Address;
    }

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

    //Static method
    public void studentCount()
    {
        count=count+1;
    }
    //getter to fetch the value
    public static int getCount() {
        return count;
    }
}
