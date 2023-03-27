package com.methodoverloading;

public class MethodOverloadingDemo {
    public int multiply(int x, int y)//multiply method is overloading
    {
        return(x *y);
    }
    public int multiply(int x,int y,int z)
    {
        return (x*y*z);
    }
    public double multiply(double x, double y)
    {
        return(x*y);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo=new MethodOverloadingDemo();
        System.out.println(demo.multiply(10,20));
        System.out.println(demo.multiply(10,20,10));
        System.out.println(demo.multiply(20.5,10.5));
    }
}
