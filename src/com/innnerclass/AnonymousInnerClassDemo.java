package com.innnerclass;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        //interface cls  obj=new base cls
        Bicycle mountainBike=new MountainBike();
        mountainBike.canApplyBreak();
        mountainBike.canSpeedUp();
        System.out.println("the above and below code meant to work same except that in above code Bicycle \n" +
                "interface cls has child cls MountainBike, whereas in below code Anonymousinnnerclass is instantiated\n" +
                "for Bicycle interface cls");
        //below is the way how anonymousinnerclass is instantiated
        Bicycle bicycle= new Bicycle() {
            @Override
            public void canSpeedUp() {
                System.out.println("anonymous innercls output");
            }
            @Override
            public void canApplyBreak() {
                System.out.println("anonymous innercls output");
            }
        };
        bicycle.canApplyBreak();
        bicycle.canSpeedUp();
    }
}
