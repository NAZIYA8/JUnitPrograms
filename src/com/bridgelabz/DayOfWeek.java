package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the date (M-D-Y)");
        System.out.println("enter the month");
        int m = scan.nextInt();
        System.out.println("enter the day");
        int d = scan.nextInt();
        System.out.println("enter the year");
        int y = scan.nextInt();

        int day = Utility.dayOfWeek(m, d, y);
        System.out.println(day);
    }

}