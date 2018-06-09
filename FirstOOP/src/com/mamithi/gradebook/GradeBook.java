package com.mamithi.gradebook;

import java.security.PublicKey;
import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook(String name){
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the Grade Book for\n%s!\n", getCourseName());
    }

    // Determine class average based on 10 grades entered by user
    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);

        int total=0, gradeCounter=0, grade;
        double average;

        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while(grade != -1){
            total += grade;
            gradeCounter += 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

        }

        if(gradeCounter != 0){
            average = (double) total / gradeCounter;

            System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);

        }else{
            System.out.printf("No grades were entered");
        }





//        while ( gradeCounter <= 10){
//            System.out.printf("Enter grade %d: ", gradeCounter);
//            grade = input.nextInt();
//            total += grade;
//            gradeCounter += 1;
//        }
//
//        average = total/10;
//
//        System.out.printf("\nTotal of all 10 grades is %d\n", total);
//        System.out.printf("Class average is %d\n", average);


    }
}
