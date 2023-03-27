package com.trycatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {//block 1
            try {//block 2
                try {//block 3
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[3]);//accesing value at index3
                    System.out.println(arr[10]);//accesing value at index10 so throws an exception
                } catch (ArrayIndexOutOfBoundsException e) {//catch for block3
                    System.out.println("Exception in block3: " +e.getMessage());
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {//catch for block2
                System.out.println("Exception in block2: " +e2.getMessage());
                throw e2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {//catch for block1
            System.out.println("Exception in block1: " +e.getMessage());

        }
    }
}
