package com.interfaces;

public class interfaceDemo {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(20,10,20);
        System.out.println(mountainBike.getSeatHeight());
        System.out.println(mountainBike.getSpeed());
        System.out.println(mountainBike.getGear());
        mountainBike.applyBrake(10);
        System.out.println(mountainBike.getSpeed());
        mountainBike.speedUp(20);
        System.out.println(mountainBike.getSpeed());



    }
}
