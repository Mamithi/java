package com.mamithi.gradebooktest;

import com.mamithi.gradebook.GradeBook;

public class GradeBookTest {
    public static void main(String[] args){
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook gradeBook = new GradeBook("Bsc Computer Science", gradesArray);

        gradeBook.displayMessage();
        gradeBook.proceessGrades();


    }
}
