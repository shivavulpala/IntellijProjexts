package com.staticnestedclass;

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        //accessing StaticNestedClass by initializing an instance/obj
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();//innner cls can be accessed
        //only referring to outer cls
        staticNestedClass.Display();
    }
}
