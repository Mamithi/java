package com.mamithi.initarray;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int total = 0;
        int[] array = new int[ARRAY_LENGTH];


        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
            total += array[counter];
        }

        System.out.printf("Total of %d array elements is:  %d\n",
                ARRAY_LENGTH, total);
    }
}
