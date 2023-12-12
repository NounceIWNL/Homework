package Tasks14_12_2023;

import java.util.Scanner;

public class Task4_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three-digit number: ");
        double inputNumber = scanner.nextDouble();

        double thirdDigit = inputNumber % 10;
        double secondDigit = (int)((inputNumber % 100 - thirdDigit) / 10);
        double firstDigit = (int)((inputNumber % 1000 - (secondDigit * 10)) / 100);

        double squareOfScanner = Math.sqrt(inputNumber);
        double third = 3.;
        double summaryOfTheCubes = Math.pow(thirdDigit, third) + Math.pow(secondDigit, third) + Math.pow(firstDigit, third);

        System.out.println(squareOfScanner == summaryOfTheCubes);

    }
}
