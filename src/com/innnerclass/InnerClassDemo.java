package com.innnerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass().new InnerClass();
        innerClass.Display();
        OuterClass outerClass=new OuterClass();
        outerClass.outerClassMethod();

    }
}
