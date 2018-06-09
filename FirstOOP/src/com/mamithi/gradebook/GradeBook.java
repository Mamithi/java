package com.mamithi.gradebook;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.security.PublicKey;
import java.util.Scanner;

public class GradeBook {

    private String courseName;
    private int total, gradeCounter, aCount, bCount, cCount, dCount, fCount;

    public GradeBook(String name) {
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

    public void inputGrades() {
        Scanner input = new Scanner(System.in);

        int grade;

        System.out.printf("%s\n%s\n %s\n %s\n",
                "Enter the integer grades in the range 0-100",
                "Type the end-of-line indicator to terminate input:",
                "On Unix/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            incrementLetterGradeCounter(grade);
        }
    }

    private void incrementLetterGradeCounter(int grade) {
        switch (grade / 10) {
            case 9:
            case 10:
                ++aCount;
                break;

            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
        }
    }

    public void displayGradeReport() {
        System.out.println("\nGrade Report: ");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount
            );
        }else{
            System.out.println("No grades were entered");
        }
    }

    // Determine class average based on 10 grades entered by user
//    public void determineClassAverage() {
//        Scanner input = new Scanner(System.in);
//
//        int total = 0, gradeCounter = 0, grade;
//        double average;
//
//        System.out.print("Enter grade or -1 to quit: ");
//        grade = input.nextInt();
//
//        while (grade != -1) {
//            total += grade;
//            gradeCounter += 1;
//
//            System.out.print("Enter grade or -1 to quit: ");
//            grade = input.nextInt();
//
//        }
//
//        if (gradeCounter != 0) {
//            average = (double) total / gradeCounter;
//
//            System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
//            System.out.printf("Class average is %.2f\n", average);
//
//        } else {
//            System.out.printf("No grades were entered");
//        }
//
//
////        while ( gradeCounter <= 10){
////            System.out.printf("Enter grade %d: ", gradeCounter);
////            grade = input.nextInt();
////            total += grade;
////            gradeCounter += 1;
////        }
////
////        average = total/10;
////
////        System.out.printf("\nTotal of all 10 grades is %d\n", total);
////        System.out.printf("Class average is %d\n", average);
//
//
//    }
}
