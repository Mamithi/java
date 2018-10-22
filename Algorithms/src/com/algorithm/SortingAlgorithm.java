package com.algorithm;

public class SortingAlgorithm
{
    public static void main(String[] args)
    {
        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};

        selectionSort(input);

        printArray(input);
    }


    private static void selectionSort(int[] input)
    {
        for (int i = 0; i < input.length - 1; i++) {

            int indexOfSmallest = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }

            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
    }

    private static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println();
    }
}
