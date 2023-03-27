package practice.basicprograms;

import java.util.Scanner;

public class CheckLeapYear {
    public static void is_leap_year(int l) {
        boolean is_leap_year=false;
        //System.out.println("Enter a year:");
        if(l%4==0)
        {
            is_leap_year = true;
            if (l % 100 == 0)
            {
                is_leap_year = true;
                if (l % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
            else
                is_leap_year=false;
        }
        else
            is_leap_year=false;

        if(is_leap_year)
            System.out.println(l +" Is leap year");
        else
            System.out.println(l +" Is not leap year");
    }


    public static void main(String[] args) {
        is_leap_year(2020);
        is_leap_year(2000);
    }
}
