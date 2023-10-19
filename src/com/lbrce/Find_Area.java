package com.lbrce;

import java.util.Scanner;

public class Find_Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int shape = scanner.nextInt();

        double area = 0;

        switch (shape) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                area = calculateCircleArea(radius);
                break;
            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                area = calculateRectangleArea(length, width);
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                area = calculateTriangleArea(base, height);
                break;
            default:
                System.out.println("Invalid shape");
                return;
        }

        System.out.println("Area: " + area);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
