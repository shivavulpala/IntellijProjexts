package com.example;

public class Switch {
    public static void main(String args[])
    {
        int month=10;
        String monthname;

        switch(month)
        {
            case 1:
                monthname="jan";
                break;

            case 2:
                monthname="feb";
                break;

            case 3:
                monthname="mar";
                break;

            default:
                monthname="invalid";
                break;
        }
        System.out.println(monthname);
    }

}
