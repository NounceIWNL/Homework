package Tasks21_12_2023;

import java.util.Random;

public class Task5_40 {
    public static void main(String[] args) {
        Random random = new Random();

        double summary = 0;
        double x;
        int n = 10;
        double y;


        for (int i = 0; i < 10 ; i++) {
            y = random.nextDouble(n);
            x = y;
            summary += x;
            System.out.println(summary);
            System.out.println(y);
        }
        System.out.println(summary);
    }
}
