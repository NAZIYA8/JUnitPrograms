package utility;

import java.lang.Math;

public class Utility {

    /**
     * @param m is month
     * @param d is day
     * @param y is year
     * @return day of the week
     */
    public static int dayOfWeek(int m, int d, int y) {
        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + 12 * ((14 - m) / 12) - 2;
        int d1 = (d + x + 31 * m1 / 12) % 7;
        return d1;
    }

    /**
     * @param P is Principal amount
     * @param Y is year
     * @param R rate of Interest
     * @return monthly payment
     */
    public static int monthlyPayment(double P, double Y, double R) {
        double r = R / (12 * 100);
        double n = -1 * 12 * Y;
        double payment = (P * r) / (1 - Math.pow((1 + r), n));
        return (int) payment;
    }

    /**
     * @param c is non-negative number
     * @return square root of number entered
     */
    public static double sqrt(double c) {
        double t = c;
        double epslion = 1 * Math.exp(-15);
        while (Math.abs(t - c / t) > epslion * t) {
            t = ((c / t) + t) / 2;
        }
        return (int) t;
    }

    /**
     * @param number to convert it to binary
     * @returns a binary representation of a number
     */
    public static String toBinary(long number) {

        String str = "";
        int pow = 1;
        while (pow <= number / 2) {
            pow *= 2;
        }
        while (pow > 0) {
            if (number < pow) {
                str += 0;
            } else {
                str += 1;
                number -= pow;
            }
            pow = pow / 2;
        }
        return str;
    }

    /**
     * Finding the fewest notes to be returned for vending machine
     *
     * @param change
     */
    public static void vendingMachine(int change) {
        int notes[] = {1, 2, 5, 10, 50, 100, 500, 1000};
        int len = notes.length;
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            while (change >= notes[i]) {
                change -= notes[i];
                System.out.print(notes[i] + " ");
                count++;
            }
        }
        System.out.println("\nNumber of changes:" + count);
    }

    /**
     * read input and convert to binary
     * swap nibbles and find new number
     */
    public static void swapNibbles(String binary) {

        if (binary.length() < 8) {
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
        }
        System.out.println("Before Swapping Nibbles:" + binary);
        char arr[] = binary.toCharArray();
        for (int i = 0; i < 4; i++) {
            char ch = arr[i];
            arr[i] = arr[i + 4];
            arr[i + 4] = ch;
        }
        binary = String.valueOf(arr);
        System.out.println("After Swapping Nibbles:" + binary);
        int c = Integer.parseInt(binary);
        int decimal = 0;
        int power = 0;
        // to convert binary to decimal
        while (true) {
            if (c == 0) {
                break;
            } else {
                int tmp = c % 10;
                decimal += tmp * Math.pow(2, power);
                c = c / 10;
                power++;
            }
        }
        System.out.println("Number after Swapping Nibbles: " + decimal);
    }

    /**
     * @param choice      Choose 1 or 2
     *                    choose1: Celcius to Farenheit
     *                    choose2: Farenheit to Celcius
     * @param temperature Temperature to covert
     */
    public static void tempConvert(int choice, int temperature) {
        int convert;
        switch (choice) {
            case 1:
                convert = (temperature * 9 / 5) + 32;
                System.out.println("After Conversation:" + convert);
                break;

            case 2:
                convert = (temperature - 32) * 5 / 9;
                System.out.println("After Conversation:" + convert);
                break;
            default:
                break;
        }
    }
}