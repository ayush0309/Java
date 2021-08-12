package com.ayush;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fac = 1;
        for (int n=num; n>0; n--)
             fac = fac * n;

        System.out.println("Factorial of " + num + " is " + fac);


    }
}
