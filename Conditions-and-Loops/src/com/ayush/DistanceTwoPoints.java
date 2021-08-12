package com.ayush;

import java.util.Scanner;
import java.lang.Math;

public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.println("Enter x and y values for point 1: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.println("Enter x and y values for point 2: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println(Math.sqrt((Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2))));
    }
}
