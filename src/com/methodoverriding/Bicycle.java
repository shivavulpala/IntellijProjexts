package com.methodoverriding;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed)
    {
        gear=startGear;
        speed=startSpeed;
    }

    public void setGear(int newValue)
    {
        gear=newValue;
    }
    public void speedUp(int increment) {
        speed=speed+increment;
    }
    public void applyBrake(int decrement)
    {
        speed=speed-decrement;
    }
}
