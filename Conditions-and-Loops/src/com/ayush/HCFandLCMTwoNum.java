package com.ayush;

import java.util.Scanner;

public class HCFandLCMTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, hcf = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        for (int i = 1; i<=num1 && i<=num2; i++) {
            if (num1%i == 0 && num2%i == 0) {
                hcf = i;
            }
        }

        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
