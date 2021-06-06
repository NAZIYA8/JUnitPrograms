package com.bridgelabz;

import utility.Utility;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to convert into binary: ");
        long number = scan.nextLong();
        String binary = Utility.toBinary(number);
        System.out.println("Binary representation of " + number + " is " + binary);
    }
}