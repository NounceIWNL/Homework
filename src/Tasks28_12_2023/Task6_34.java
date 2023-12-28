package Tasks28_12_2023;

public class Task6_34 {
    public static void main(String[] args) {
        int countOfNumbers = 0;
        int currentNumber = 100;

        while (countOfNumbers < 15) {
            if (currentNumber % 19 == 0) {
                System.out.println(currentNumber);
                countOfNumbers++;
            }
            currentNumber++;
        }
    }
}