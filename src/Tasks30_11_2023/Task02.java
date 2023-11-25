package Tasks30_11_2023;

public class Task02 {
    public static void main(String[] args) {
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        System.out.println(hundreds + tens + ones);
    }
}
