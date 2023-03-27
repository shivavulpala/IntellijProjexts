package com.innnerclass;

public class OuterClass {
    class InnerClass{//cls inside a cls
        void Display()//method inside inner cls
        {
            System.out.println("Inner class method");
        }
    }
    void outerClassMethod()//method of a cls
    {
        System.out.println("outer class method");
        class outerclass//cls inside a method
        {
            void OuterDisplay()//method inside a cls
            {
                System.out.println("Class inside outerclass method");
            }
        }
        outerclass oc=new outerclass();//initializing a cls by creating an instance
        oc.OuterDisplay();//accessing method of cls with instance
    }
}
