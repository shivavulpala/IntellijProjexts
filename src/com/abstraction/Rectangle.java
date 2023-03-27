package com.abstraction;

public class Rectangle extends GraphicObject{
    //concrete cls with abstract method definitions
    void draw() {
        System.out.println("draw rectangle");
    }

    void resize() {
        System.out.println("resize rectangle");
    }
}
