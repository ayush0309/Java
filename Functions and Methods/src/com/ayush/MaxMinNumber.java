package com.ayush;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.print("Maximum Number: ");
        System.out.println(MaxNumber(num1, num2, num3));

        System.out.print("Minimum Number: ");
        System.out.print(MinNumber(num1, num2, num3));
    }

    static int MaxNumber(int a, int b, int c) {
        int max = a;
        if (a < b && c < b)
            max = b;
        if (a < c && b < c)
            max = c;

        return max;
    }

    static int MinNumber(int a, int b, int c) {
        int min = a;
        if (a > b && c > b)
            min = b;
        if (a > c && b > c)
            min = c;

        return min;

    }
}