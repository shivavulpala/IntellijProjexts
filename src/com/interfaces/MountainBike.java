package com.interfaces;
//child class
public class MountainBike implements Bicycle {

    private int seatHeight;
    private int speed;
    private int gear;

    public MountainBike(int startHeight,int startSpeed, int startGear)
    {
        seatHeight=startHeight;
        speed=startSpeed;
        gear=startGear;
    }
    @Override
    public void applyBrake(int decrement) {
        speed=speed-decrement;

    }
    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }
//getters and setters since variables are declared as private
    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}
