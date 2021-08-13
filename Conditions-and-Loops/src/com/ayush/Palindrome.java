package com.ayush;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverseNum = 0, originalNum = num;

        while (num>0) {
            int rem = num % 10;
            reverseNum = (reverseNum * 10) + rem;
            num /= 10;
        }

        if (originalNum == reverseNum)
            System.out.println(originalNum + " is a palindrome");
        else
            System.out.println(originalNum + " is not a palindrome");
    }
}
