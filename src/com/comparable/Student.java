package com.comparable;

public class Student implements Comparable<Student>{
    int rollnumber;
    String name;
    String address;
    public Student(int rollnumber, String name, String address)
    {
        this.rollnumber=rollnumber;
        this.name=name;
        this.address=address;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override//same as below code lines 43-46
//    public int compareTo(Student o) {
//        return 0;
//    }

    public int compareTo(Student student)
    {
        return this.rollnumber-student.rollnumber;
        //if this value>0, current obj takes precedence
        //if this value<0, foreign obj takes precedence
        //if this value=0, either of them can come first
    }

}
