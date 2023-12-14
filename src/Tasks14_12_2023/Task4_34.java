package Tasks14_12_2023;

import java.util.Scanner;

public class Task4_34 {
    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Input X: ");
        int x = scannerX.nextInt();
        Scanner scannerY = new Scanner(System.in);
        System.out.println("Input Y: ");
        int y = scannerY.nextInt();

        if (y % x == 0)
            System.out.println("X is a divider of Y.");
        else if (x % y == 0)
            System.out.println("Y is a divider of X.");
        else System.out.println(false);

    }
}
