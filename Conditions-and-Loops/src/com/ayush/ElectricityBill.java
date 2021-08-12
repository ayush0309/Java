package com.ayush;
/*
Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:
1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
 */

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        int bill = 0;
        if (unit > 0) {
            if (unit<=100)
                bill = unit * 10;
            else if (unit <= 200)
                bill = (100 * 10) + ((unit - 100) * 15);
            else if (unit <= 300)
                bill = (100 * 10) + ( 100 * 15) + ((unit - 200) * 20);
            else if (unit > 300)
                bill = (100 * 10) + ( 100 * 15) + (100 * 20) + ((unit - 300) * 25);

            System.out.println("Your electricity bill: Rs." + bill );
        }
        else
            System.out.println("Enter valid units value!");

    }
}
