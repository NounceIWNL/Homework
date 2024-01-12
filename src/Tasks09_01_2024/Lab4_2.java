package Tasks09_01_2024;

public class Lab4_2 {
    public static void main(String[] args) {
        double[] matrix = {1, 2.5, -2, 1, 3, -4.7, -4, 8, 3, -10};

        double negativeNumbersSummary = 0;
        double positiveNumbersSummary = 0;

        double negativeNumbersCount = 0;
        double positiveNumbersCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > 0) {
                positiveNumbersSummary += matrix[i];
                positiveNumbersCount++;
            } else if (matrix[i] < 0) {
                negativeNumbersSummary += Math.abs(matrix[i]);
                negativeNumbersCount++;
            }
        }

        double arithmeticMeanOfPositiveNumbers = positiveNumbersSummary / positiveNumbersCount;
        double arithmeticMeanOfNegativeNumbers = negativeNumbersSummary / negativeNumbersCount;

        double multiplication = arithmeticMeanOfNegativeNumbers * arithmeticMeanOfPositiveNumbers;

        System.out.println("Arithmetic mean of negative numbers is " + arithmeticMeanOfNegativeNumbers);
        System.out.println("Arithmetic mean of positive numbers is " + arithmeticMeanOfPositiveNumbers);
        System.out.println("The multiplication is " + multiplication);
    }
}
