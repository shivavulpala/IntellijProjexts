package com.abstraction;

public abstract class GraphicObject {
    //abstract cls
    int x, y;
    //abs cls constructor
    public GraphicObject()
    {
        System.out.println("Abstract class constructor called through subclass");
    }
    //concrete method with function definition in abstract cls
    void moveTo(int newX, int newY)
    {
        System.out.println(+x +"and" +y);
    }
    //abs methods
    abstract void draw();
    abstract void resize();
}
