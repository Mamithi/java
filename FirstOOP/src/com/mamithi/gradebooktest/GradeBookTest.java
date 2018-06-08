package com.mamithi.gradebooktest;

import com.mamithi.gradebook.GradeBook;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GradeBook gradeBook = new GradeBook("Bsc Computer Science");

        gradeBook.displayMessage();
        gradeBook.determineClassAverage();
    }
}
