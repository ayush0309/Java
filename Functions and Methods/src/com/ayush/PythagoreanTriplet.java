package com.ayush;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(pythaTrip(a,b,c));
    }

    static boolean pythaTrip(int a, int b, int c) {
        if (a * a + b * b == c * c)
            return true;
        else if (b*b + c*c == a*a)
            return true;
        else if (a*a + c*c == b*b)
            return true;
        else
            return false;
    }

}
