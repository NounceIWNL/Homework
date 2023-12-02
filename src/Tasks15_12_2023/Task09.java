package Tasks15_12_2023;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scannerX1 = new Scanner(System.in);
        System.out.println("Input X: ");
        int x1 = scannerX1.nextInt();

        Scanner scannerY1 = new Scanner(System.in);
        System.out.println("Input Y: ");
        int y1 = scannerY1.nextInt();

        Scanner scannerX2 = new Scanner(System.in);
        System.out.println("Input X: ");
        int x2 = scannerX2.nextInt();

        Scanner scannerY2 = new Scanner(System.in);
        System.out.println("Input Y: ");
        int y2 = scannerY2.nextInt();
        System.out.println();

        if (y1 == y2) {
            System.out.println("The road is flat.");
        } else if (y1 > y2) {
            System.out.println("It is downhill.");
        } else
            System.out.println("It is uplift.");
        }


    }

