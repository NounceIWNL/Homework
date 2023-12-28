package Tasks28_12_2023;

import java.util.Scanner;

public class Task5_86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        int summary = 0;
        for (int i = 1; i <= (2 * n - 1); i = i + 2) {
            summary += i;
            System.out.println(i);
        }
        System.out.println("Квадрат числа " + n + " равен " + summary);
    }
}