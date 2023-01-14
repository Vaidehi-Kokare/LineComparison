package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
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
        double len1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double len2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
        if(len1==len2)
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
    }
}
