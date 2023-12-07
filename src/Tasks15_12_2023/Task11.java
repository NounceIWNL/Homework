package Tasks15_12_2023;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scannerA.nextDouble();
        System.out.println();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Input b: ");
        double b = scannerB.nextDouble();
        System.out.println();
        Scanner scannerC = new Scanner(System.in);
        System.out.println("Input c: ");
        double c = scannerC.nextDouble();
        System.out.println();

        double d = (b * b) - 4 * a * c; // d - discriminant

        double x1 = (- b + Math.sqrt(d)) / (2 * a);
        double x2 = (- b - Math.sqrt(d)) / (2 * a);

        if (d > 0)
            System.out.println("The following square roots are: " + x1 + " and " + x2);
        else if (d == 0)
            System.out.println("The following square roots are: " + x1 + " and " + x2);
        else
            System.out.println("No square roots.");








    }
}
