package com.inheritance;

import java.util.Arrays;

public class inheritanceDemo {
    public static void main(String[] args) {
        mountainBike mountainbike = new mountainBike(10, 20, 20);//initializing child cls
        System.out.println(mountainbike.gear);
        System.out.println(mountainbike.seatHeight);
        System.out.println(mountainbike.speed);
        mountainbike.applyBreak(5);
        System.out.println(mountainbike.speed);
        mountainbike.setSeatHeight(5);
        System.out.println(mountainbike.seatHeight);
        mountainbike.setSpeed(25);
        System.out.println(mountainbike.speed);
    }
}
