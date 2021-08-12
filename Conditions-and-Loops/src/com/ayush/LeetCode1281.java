package com.ayush;

import java.util.Scanner;

public class LeetCode1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int prod = 1;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            prod *= rem;
            sum += rem;

            num /= 10;
        }
        System.out.println("Result :" + (prod - sum));
    }
}
