package Tasks15_12_2023;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input six-digit number of your ticket: ");
        double inputNumber = scanner.nextDouble();

        double ones = inputNumber % 10;
        double tens = (int)((inputNumber % 100 - ones) / 10);
        double hundreds = (int)((inputNumber % 1000 - (tens * 10)) / 100);
        double thousands = (int)((inputNumber % 10000 - (hundreds * 100)) / 1000);
        double tensOfThousands = (int)((inputNumber % 100000 - (thousands * 1000)) / 10000);
        double hundredsOfThousands = (int)((inputNumber % 1000000 - (tensOfThousands * 10000)) / 100000);

        double lastThreeDigitsSummary = ones + tens + hundreds;
        int lastThreeDigitSummaryInt = (int)lastThreeDigitsSummary;
        double firstThreeDigitsSummary = thousands + tensOfThousands + hundredsOfThousands;
        int firstThreeDigitSummaryInt = (int)firstThreeDigitsSummary;

        //Я использовал перевод из double в int т.к. числа получались с сотыми долями.

        if (lastThreeDigitSummaryInt == firstThreeDigitSummaryInt)
            System.out.println("You've got a lucky ticket!");
        else
            System.out.println("You get lucky next time!");

    }
}
