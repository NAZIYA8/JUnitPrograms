package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make a Choice:");
        System.out.println("Choose 1: Celsius to Fahrenit\nChoose 2: Fahrenit to Calsius");
        int choice = scan.nextInt();
        System.out.println("Enter the temperature:");
        int temperature = scan.nextInt();
        Utility.tempConvert(choice, temperature);

    }
}
