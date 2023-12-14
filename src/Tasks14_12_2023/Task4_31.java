package Tasks14_12_2023;

import java.util.Scanner;

public class Task4_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three-digit number: ");
        double inputNumber = scanner.nextDouble();

        double thirdDigit = inputNumber % 10;
        double secondDigit = (int)((inputNumber % 100 - thirdDigit) / 10);
        double firstDigit = (int)((inputNumber % 1000 - (secondDigit * 10)) / 100);

        if (thirdDigit == secondDigit && secondDigit == firstDigit)
            System.out.println("All digits of this number are equal.");
        else if (thirdDigit == secondDigit || secondDigit == firstDigit || thirdDigit == firstDigit)
            System.out.println("Two digits of this number are equal.");
        else System.out.println(false);
    }
}
