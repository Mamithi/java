package com.mamithi.sumeven;

public class SumEven {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 2; i <= 20; i+=2){
            total += i;
        }
        System.out.printf("Sum of even numbers between 2 and 20 is %d\n\n", total);
    }
}
