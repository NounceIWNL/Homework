package Tasks21_12_2023;

import java.util.Random;

public class Task5_40 {
    public static void main(String[] args) {
        Random random = new Random();

        double summary = 0;
        double current;
        int n = 10;



        for (int i = 0; i < 10 ; i++) {
            current = random.nextDouble(n);

            summary += current;
            System.out.printf("%.3f", current);
            System.out.println();
        }
        System.out.printf("%.3f", summary);
    }
}
