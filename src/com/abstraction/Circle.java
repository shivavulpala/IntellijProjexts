package com.abstraction;

public class Circle extends GraphicObject{
//concrete cls with abstract method definitions
    @Override
    void draw() {
        System.out.println("draw circle");
    }

    @Override
    void resize() {
        System.out.println("resize circle");
    }
}
