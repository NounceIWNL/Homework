package Tasks21_12_2023;

import java.util.Random;

public class Task5_47 {
    public static void main(String[] args) {
        Random random = new Random();

        int multiplication = 1;
        int current;
        int n = 10;

        for (int i = 0; i < 6 ; i++) {
            current = random.nextInt(n);

            multiplication *= current;
            System.out.println(current);
        }
        System.out.println(multiplication);
    }
}



