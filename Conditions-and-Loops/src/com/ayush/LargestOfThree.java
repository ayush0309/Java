package com.ayush;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//      Approach - I
//        int max = a;
//        if (b>max) {
//            max = b;
//        }
//        if (c>max) {
//            max = c;
//        }


//        Approach-II

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
