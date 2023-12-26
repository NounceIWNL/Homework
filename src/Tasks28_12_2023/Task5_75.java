package Tasks28_12_2023;

public class Task5_75 {
    public static void main(String[] args) {

        double number = 2;
        double grading;
        double summary = 0;
        for (int i = 2; i < 11; i++) {
            grading = i;
            summary += number * grading;
            grading++;
            System.out.println(summary);


            
        }

    }
}
