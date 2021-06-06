package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter non negative number c");
        int c = scan.nextInt();
        System.out.println("the square root of " + c + " is " + Utility.sqrt(c));
    }
}