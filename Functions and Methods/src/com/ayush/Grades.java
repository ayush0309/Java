package com.ayush;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100: ");
        int marks = in.nextInt();
        System.out.println(yourGrade(marks));
    }

    static String yourGrade(int m) {
        String grade;
        if (m > 90 && m <= 100)
            grade = "AA";
        else if (m > 80 && m <= 90)
            grade = "AB";
        else if (m > 70 && m <= 80)
            grade = "BB";
        else if (m > 60 && m <= 70)
            grade = "BC";
        else if (m > 50 && m <= 60)
            grade = "CD";
        else if (m > 40 && m <= 50)
            grade = "DD";
        else if (m < 40 )
            grade = "Fail";
        else
            return "Enter valid marks";

        return grade;

    }
}
