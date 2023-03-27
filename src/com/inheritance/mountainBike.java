package com.inheritance;
//child class

public class mountainBike extends Bicycle{

    int seatHeight;
    public mountainBike(int startHeight, int startGear, int startSpeed) {
        super(startGear, startSpeed);
        this.seatHeight=startHeight;
    }
    public void setSeatHeight(int newValue)
    {
        seatHeight=newValue;
    }
}
