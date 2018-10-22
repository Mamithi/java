package com.algorithm;

public class QuickSort
{
    public static void main(String[] args)
    {
        // Intialialize an array
        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};
        int[] inputMedian = input;

        // Sort
        quickSortExecutor(input);
        quickSortMedianExecutor(inputMedian);

        // Print Results
        printArray(input);


    }

    private static void quickSortExecutor(int[] input)
    {
        quickSort(input, 0, input.length - 1);
    }

    private static void quickSort(int[] input, int from, int to)
    {
        if (from < to) {
            int indexOfPivot = partition(input, from, to);
            quickSort(input, from, indexOfPivot - 1);
            quickSort(input, indexOfPivot + 1, to);
        }
    }

    private static int partition(int[] input, int from, int to)
    {
        int pivot = input[to];
        int wall = from;
        for (int i = from; i < to; i++) {
            if (input[i] <= pivot) {
                int temp = input[wall];
                input[wall] = input[i];
                input[i] = temp;
                wall++;
            }
        }

        input[to] = input[wall];
        input[wall] = pivot;

        return wall;
    }

    private static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }

    private static void quickSortMedianExecutor(int[] input)
    {
        quickSort(input, 0, input.length - 1);
    }

    private static void quickSortMedian(int[] input, int from)
    {

    }

}
