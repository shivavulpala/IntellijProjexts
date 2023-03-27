package com.methodcalling;

public class MethodCallingDemo {
    public static void main(String[] args)
    {
        {
            int i=1;
            changeValue(i);//pass by value, the obj is copied locally to the method
            System.out.println(i);

            //method calling demo for student class
            Student shiva=new Student("shiva", 30,"slc,ut 84108");
            changeName(shiva);//calling method changename to change student name
            Student result=changeNameAgain(shiva);//mutating before methods
            System.out.println(result.getName());
            System.out.println(shiva.getAge());
            System.out.println(shiva.getAddress());
        }
    }

    private static void changeValue(int i)
    {
        i=i+1;
        System.out.println(i);//this value gets printed first, since method is called
        //before sout in main method
    }

    static void changeName(Student student) {//method to change the name of the student
        student.setName("Hari");
    }

    static Student changeNameAgain(Student student)
    {
        Student newstudent=new Student("LadduChinnu", student.getAge(), student.getAddress());
        return newstudent;
    }

}
