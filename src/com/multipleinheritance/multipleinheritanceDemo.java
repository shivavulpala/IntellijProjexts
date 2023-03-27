package com.multipleinheritance;
//main method, showing multiple inheritance is only possible using interfaces
public class multipleinheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike=new MountainBike(20,10,20);

        System.out.println(mountainBike.getGear());
        System.out.println(mountainBike.getSpeed());
        System.out.println(mountainBike.getSeatHeight());

         mountainBike.applyBreak(10);
        System.out.println(mountainBike.getSpeed());

        mountainBike.setSpeed(20);
        System.out.println(mountainBike.getSpeed());

        mountainBike.canDrive();//vehicle
        mountainBike.canRotateWheels();//twowheeler


    }
}
