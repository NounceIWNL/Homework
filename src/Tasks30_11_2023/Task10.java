package Tasks30_11_2023;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        final int WEIGHT = 100;
        final int HEIGHT = 193;
        int perfectWeight = HEIGHT - 110;
        if (WEIGHT != perfectWeight) {
            int weightDifference = perfectWeight - WEIGHT;
            if (weightDifference < 0) {
                System.out.println("You need to lose " + weightDifference + " kg.");
            } else {
                System.out.println("You need to gain " + (perfectWeight - WEIGHT) + " more kg.");
            }
        } else {
            System.out.println("Your current weight is perfect!");
        }
    }
}

