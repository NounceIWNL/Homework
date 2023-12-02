package Tasks15_12_2023;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Input X: ");
        int numberX = scannerX.nextInt();
        System.out.println();
        Scanner scannerY = new Scanner(System.in);
        System.out.println("Input Y: ");
        int numberY = scannerY.nextInt();
        System.out.println();

        if ((numberX % 2 == 0 && numberY % 2 == 0) || (numberX % 2 != 0 && numberY % 2 != 0)) {
            System.out.println("YES");
        }
    }
}
