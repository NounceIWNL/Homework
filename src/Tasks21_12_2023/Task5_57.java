package Tasks21_12_2023;

import java.util.Random;

public class Task5_57 {
    public static void main(String[] args) {
        Random randomOne = new Random();
        Random randomTwo = new Random();

        int firstStudentGradesSummary = 0;
        int firstStudentCurrent;
        int secondStudentGradesSummary = 0;
        int secondStudentCurrent;
        int nForRandom = 10;

        for (int i = 0; i < 4; i++) {
            firstStudentCurrent = randomOne.nextInt(nForRandom);
            secondStudentCurrent = randomTwo.nextInt(nForRandom);

            firstStudentGradesSummary += firstStudentCurrent;
            secondStudentGradesSummary += secondStudentCurrent;
            System.out.print(firstStudentCurrent + " ");
            System.out.println(secondStudentCurrent + " ");
            System.out.println();

        }
        System.out.print(firstStudentGradesSummary + " ");
        System.out.print(secondStudentGradesSummary);
    }

}




