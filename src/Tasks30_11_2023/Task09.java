package Tasks30_11_2023;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        double number = scanner.nextDouble();
        System.out.println(number);
        int numberAsInt = (int) number;
        boolean result = number == numberAsInt;
        System.out.println(result);
    }
}
