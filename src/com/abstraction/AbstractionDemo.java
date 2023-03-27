package com.abstraction;

public class AbstractionDemo {
    //main method
    public static void main(String[] args) {
        //initialize abstract cls to concrete cls
        //reference is of abs cls and obj is of child cls
        GraphicObject circle=new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle=new Rectangle();
        rectangle.resize();
        rectangle.draw();

       // GraphicObject go= new GraphicObject(); //if we uncomment this particular line, it will be clear that abstract
        //classes cannot be instantiated(meaning constructor cant be created)explicitly but subclasses can be created
        //and the abstract classes can only be instantiated implicitly by subclass through internal mechanism of
        // Java(inheritance).
        }

    }
