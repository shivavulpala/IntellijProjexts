package com.methodoverriding;

public class MountainBike extends Bicycle{
    public int seatHeight;
    //defining a constructor
    public MountainBike(int startHeight, int startSpeed, int startGear)
    {
        super(startGear,startSpeed);//calls super to get this values
        seatHeight=startHeight;
    }
    public void setSeatHeight(int newValue)
    {
        seatHeight=newValue;
    }

    @Override
    public void setGear(int newValue) {
        gear=newValue+10;
    }
    @Override
    public void speedUp(int increment) {
        speed=speed+increment+10;
    }
    @Override
    public void applyBrake(int decrement) {
        speed=speed-decrement-10;
    }

}
