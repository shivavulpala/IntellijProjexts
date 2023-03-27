package com.example;

public class ConstructorCuboid {

    int height;
    int width;
    int depth;

    ConstructorCuboid(int height, int width, int depth)//accepts all params
    {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    ConstructorCuboid(int height, int width)//accepts 2 params, one constant parameter
    {
        this.height=height;
        this.width=width;
        this.depth=10;
    }

    ConstructorCuboid(int dimension)//accepts all params same so cube
    {
        height=dimension;
        width=dimension;
         depth=dimension;
    }

    ConstructorCuboid()//all constant values with no parameters passed in constructor
    {
        this.height=10;
        this.width=10;
        this.depth=10;
    }
    int volume(){
        return height*width*depth;
    }
    public static void main(String args[])
    {
        int volume;
        ConstructorCuboid cuboidAcceptsAllParams=new ConstructorCuboid(3,4,5);
        volume= cuboidAcceptsAllParams.volume();
        System.out.println(volume);

        ConstructorCuboid cuboidWithOneParam=new ConstructorCuboid(3,4);
        volume= cuboidWithOneParam.volume();
        System.out.println(volume);

        ConstructorCuboid cuboidAcceptsSameParams=new ConstructorCuboid(4);
        volume= cuboidAcceptsSameParams.volume();
        System.out.println(volume);

        ConstructorCuboid cuboidWithConstantParams=new ConstructorCuboid();
        volume= cuboidWithConstantParams.volume();
        System.out.println(volume);
    }
}
