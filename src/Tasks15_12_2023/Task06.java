package Tasks15_12_2023;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Input any year: ");
        int year = scannerX.nextInt();
        System.out.println();

        if (year % 400 == 0 && year % 4 == 0) {
            System.out.println("The current year is leap.");
        } else System.out.println("The current year is not leap.");
    }
}
