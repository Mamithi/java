package com.mamithi.randomintegers;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random random = new Random();

        int face;

        for(int counter = 1; counter <= 20; counter++){
            face = 1 + random.nextInt(6);

            System.out.printf("%d ", face);

            if(counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
