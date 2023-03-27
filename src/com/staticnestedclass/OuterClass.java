package com.staticnestedclass;

public class OuterClass {

    static int outerstaticmember=10;//static variable
    int instancemember=20;//instance variable
    private static int outerstaticprivatemember=30;//private static varibale

    static class StaticNestedClass{
        void Display(){
            System.out.println(outerstaticmember);
            System.out.println(outerstaticprivatemember);
            //System.out.println(instancemember); //cannot be accessed since its a instance variable, a static metohd
            //can only access static variables
        }

    }
}
