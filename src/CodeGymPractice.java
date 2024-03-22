import java.util.Arrays;

public class CodeGymPractice {
    public static void main(String[] args) throws Exception {
        //write your code here
        System.out.println(calc(1, '+', 2));
        System.out.println(calc(5, '-', 3));
        System.out.println(calc(2, '*', 3));
        System.out.println(calc(20, '/', 5));
        System.out.println(calc(20, '!', 5));
    }

    public static int calc(int firstDigit, char character, int secondDigit) throws Exception {
        if (character == '+') {
            return firstDigit + secondDigit;
        } else if (character == '-') {
            return firstDigit - secondDigit;
        } else if (character == '*') {
            return firstDigit * secondDigit;
        } else if (character == '/') {
            return firstDigit / secondDigit;
        } else throw new Exception("Wrong character input.");
    }
}

