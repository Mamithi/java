package com.mamithi.gradebooktest;

import com.mamithi.gradebook.GradeBook;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GradeBook gradeBook = new GradeBook("Bsc Computer Science");

        System.out.printf("Initial course name is: %s\n\n", gradeBook.getCourseName());

        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine();
        System.out.println();

        gradeBook.setCourseName(nameOfCourse);

        gradeBook.displayMessage();
    }
}
