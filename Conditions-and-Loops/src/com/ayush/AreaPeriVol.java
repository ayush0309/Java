package com.ayush;

import java.util.Scanner;

public class AreaPeriVol {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int cont;
        do {
        System.out.println("Enter your choice:");
        System.out.println("1. Find Area");
        System.out.println("2. Find Perimeter");

        int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Select shape:");
                    System.out.println("1. Circle");
                    System.out.println("2. Triangle");
                    int shapeArea = in.nextInt();
                    switch (shapeArea) {
                        case 1 -> {
                            System.out.println("Enter radius: ");
                            float radius = in.nextFloat();
                            float areaCircle = 3.14f * radius * radius;
                            System.out.println("Area of circle is " + areaCircle);
                        }
                        case 2 -> {
                            System.out.println("Enter base and height: ");
                            float base = in.nextFloat();
                            float height = in.nextFloat();
                            float areaTriangle = 1 / 2f * base * height;
                            System.out.println("Area of triangle is " + areaTriangle);
                        }
                        default -> System.out.println("Enter a valid choice!");
                    }
                }
                case 2 -> {
                    System.out.println("Select shape:");
                    System.out.println("1. Circle");
                    System.out.println("2. Rectangle");
                    int shapePeri = in.nextInt();
                    switch (shapePeri) {
                        case 1 -> {
                            System.out.println("Enter radius: ");
                            float radius = in.nextFloat();
                            float periCircle = 2 * 3.14f * radius;
                            System.out.println("Perimeter of circle is " + periCircle);
                        }
                        case 2 -> {
                            System.out.println("Enter length and breadth: ");
                            float length = in.nextFloat();
                            float breadth = in.nextFloat();
                            float periRect = 2 * (length + breadth);
                            System.out.println("Area of triangle is " + periRect);
                        }
                        default -> System.out.println("Enter a valid choice!");
                    }
                }
                default -> System.out.println("Enter a valid choice!");
            }
            System.out.println("Do you want to continue?(1- Continue and 0-exit)");
            cont = in.nextInt();
        }while(cont!=0);

    }
}
