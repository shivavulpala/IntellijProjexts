package com.multipleinheritance;
//child interface implementing base interface methods
//child interface can extend only 1 concrete base cls but can implement any no.of interfaces
//"extends->classes", "implements->interfaces"
public class MountainBike extends TwoWheeler implements Bicycle, Vehicle {

    private int gear;
    private int speed;
    private int seatHeight;
    public MountainBike(int startGear, int startSpeed, int startHeight) {
        gear=startGear;
        speed=startSpeed;
        seatHeight=startHeight;
    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBreak(int decrement) {
        speed=speed-decrement;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void canDrive() {
        System.out.println("multiple inheritance using interfaces");
    }
}
