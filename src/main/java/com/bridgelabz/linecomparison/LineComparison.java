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
        double len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The length of line drawn by points ( " + x1 +"," + y1 + " ) and ( " + x2 + "," + y2 + " ) is: " + len);
    }
}
