package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class SwapNibbles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal value:");
        int number = scan.nextInt();
        String binary = Utility.toBinary(number);
        Utility.swapNibbles(binary);
    }
}
