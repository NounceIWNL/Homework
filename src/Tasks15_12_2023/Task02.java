package Tasks15_12_2023;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number from 0 to 24: ");
        int hourNumber = scanner.nextInt();
        System.out.println();

        if (hourNumber >= 0 && hourNumber < 6) {
            System.out.println("Good night");
        } else if (hourNumber >= 6 && hourNumber < 12) {
            System.out.println("Good morning");
        } else if (hourNumber >= 12 && hourNumber < 18) {
            System.out.println("Good afternoon");
        } else if (hourNumber >= 18 && hourNumber <= 24) {
            System.out.println("Good evening");
        } else {
            System.out.println("Wrong number. Please try again.");
        }
    }
}
