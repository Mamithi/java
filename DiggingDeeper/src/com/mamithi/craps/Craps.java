package com.mamithi.craps;

import java.util.Random;

public class Craps {
    // Create a random number generator for use in method rolllDice
    private static final Random random = new Random();

    // Enumeration with constants that represent th egame status
    private enum Status {
        CONTINUE, WON, LOST
    }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }

        while (gameStatus == gameStatus.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }

        if(gameStatus == gameStatus.WON)
            System.out.println("Player Wins");
        else
            System.out.println("Player Loses");
    }

    private static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

        return sum;
    }


}
