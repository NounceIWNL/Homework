package Tasks15_12_2023;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Input X: ");
        int numberX = scannerX.nextInt();
        System.out.println();
        Scanner scannerY = new Scanner(System.in);
        System.out.println("Input Y: ");
        int numberY = scannerY.nextInt();
        System.out.println();

        if ((numberX >= 0 && numberX <=10) && (numberY >= 0 && numberY <= 10)) {
            System.out.println("The intersection point is in the first quarter.");
        } else if ((numberX <= 0 && numberX >= -10) && (numberY >= 0 && numberY <= 10)) {
            System.out.println("The intersection point is in the second quarter.");
        } else if ((numberX <= 0 && numberX >= -10) && (numberY <= 0 && numberY >= -10)) {
            System.out.println("The intersection point is in the third quarter.");
        } else if ((numberX >= 0 && numberX <= 10) && (numberY <= 0 && numberY >= -10)) {
            System.out.println("The intersection point is in the fourth quarter.");
        } else System.out.println("Wrong numbers, please try again.");

    }
}
