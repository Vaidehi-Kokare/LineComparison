package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    static void compareLength(double length1, double length2) {
        if(length1==length2)
            System.out.println("Lines are equal");
        else
        if (length1 > length2)
            System.out.println(" Length of Line1 is greater than Line 2");
        else
            System.out.println(" Length of Line1 is less than Line 2");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate of x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter coordinate of y1");
        int y1 = scanner.nextInt();
        System.out.println("Enter coordinate of x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter coordinate of y2");
        int y2 = scanner.nextInt();
        System.out.println("Enter coordinate of x2");
        int x3 = scanner.nextInt();
        System.out.println("Enter coordinate of y2");
        int y3 = scanner.nextInt();
        System.out.println("Enter coordinate of x2");
        int x4 = scanner.nextInt();
        System.out.println("Enter coordinate of y2");
        int y4 = scanner.nextInt();
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);
        compareLength(length1,length2);
    }
}
