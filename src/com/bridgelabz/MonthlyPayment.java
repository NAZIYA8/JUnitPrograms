package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class MonthlyPayment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        double P = scan.nextDouble();
        System.out.println("Enter the years");
        double Y = scan.nextDouble();
        System.out.println("Enter the rate of interest:");
        double R = scan.nextDouble();


        System.out.println("Monthly payment required " + new Utility().monthlyPayment(P, Y, R));
    }
}
