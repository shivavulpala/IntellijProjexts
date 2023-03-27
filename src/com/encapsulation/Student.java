package com.encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;
    //constructor
    public Student(String name, int age, String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    //setters
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setAdress(String address) {
        this.address = address;
    }
    //getters
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
}

