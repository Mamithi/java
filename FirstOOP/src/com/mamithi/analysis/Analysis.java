package com.mamithi.analysis;

import java.util.Scanner;

public class Analysis {
    int successCounter = 0, failCounter = 0, counter = 0, result, score;

    public void calculateScore() {
        Scanner input = new Scanner(System.in);
        while (counter < 10) {
            System.out.print("Enter student\'s result(1 =pass, 2 = fail): ");
            result = input.nextInt();

            if (result == 1) {
                successCounter += 1;
            } else {
                failCounter += 1;
            }
            counter += 1;
        }

        System.out.printf("\n\nThe summary of %d students is that %d passed and %d failed",
                counter, successCounter, failCounter);

        if(successCounter > 8){
            System.out.print("\n\nBonus to the instructor\n\n");
        }
    }


}
