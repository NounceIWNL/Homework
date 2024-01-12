package Tasks09_01_2024;


public class Lab4_1 {
    public static void main(String[] args) {
        int[] matrix = {1, 2, 2, 4, 5, 8, 9, 9};

        boolean increasingSequenceOfPrimeNumbers = true;

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] < matrix[i - 1])
                increasingSequenceOfPrimeNumbers = false;
        }
        System.out.println(increasingSequenceOfPrimeNumbers);
    }
}
