package com.bridgelabz;

import utility.Utility;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount whose Change to be return:");
        int change = scan.nextInt();
        Utility.vendingMachine(change);
    }
}