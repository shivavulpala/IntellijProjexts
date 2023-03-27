package com.innnerclass;

public class MountainBike implements Bicycle {
    //base cls providing implementation for interface methods
    @Override
    public void canSpeedUp() {
        System.out.println("can increase speed");
    }

    @Override
    public void canApplyBreak() {
        System.out.println("can apply break");
    }

}
