package com.ayush;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        int n = 485654;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 5)
                count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
