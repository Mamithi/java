package com.mamithi.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, result;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        result = num1 * num2 * num3;

        System.out.printf("Product of %d, %d and %d is %d\n", num1, num2, num3, result);
    }
}
