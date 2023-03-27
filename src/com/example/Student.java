package com.example;

public class Student {

    String name;
    int age;
    String address;

    public Student(String name, int age, String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }

    public String toString()
    {
        return("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: " + this.getAddress());
    }
    public static void main(String args[])
    {
    Student Shiva=new Student("Shiva", 30, "1597 S Foothill DR.");
    System.out.println(Shiva.toString());
//        System.out.println(Shiva.getName());
//        System.out.println(Shiva.getAge());
//        System.out.println(Shiva.getAddress());
    }
}
