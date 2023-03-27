package com.methodoverriding;

public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        //Bicycle cls reference      Bicycle cls object
               Bicycle bicycle=new Bicycle(10,20);//initialize bicycle cls
        System.out.println(bicycle.gear);
        System.out.println(bicycle.speed);
        bicycle.applyBrake(5);
        System.out.println(bicycle.speed);
        System.out.println("break");
        //initializing MountainBike with the reference of Bicycle
        //Bicycle cls ref       MountainBike cls obj => dynamic obj binding concept
        Bicycle mountainBike=new MountainBike(10,50,30);//whatever written on rhs
        //govern the variables and methods usage
        System.out.println(mountainBike.speed);
        mountainBike.applyBrake(10);
        System.out.println(mountainBike.speed);
        mountainBike.speedUp(20);
        System.out.println(mountainBike.speed);
        System.out.println(mountainBike.gear);


    }


}
