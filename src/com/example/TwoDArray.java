package com.example;

public class TwoDArray {
    public static void main(String args[])
    {
        int arr[][]= {{2,7,9},{4,5,6},{8,1,3}};
        System.out.println(arr[0][1]);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
