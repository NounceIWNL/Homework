package Tasks07_03_2024;

// вместо буквы А была взята буква И

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task15_19_a {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks07_03_2024\\JavaHomeworkText.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            char[] charArray = st.toCharArray();
            char a = 'И';
            if (!st.isEmpty() && Character.toLowerCase(charArray[0]) == Character.toLowerCase(a)) {
                System.out.println(st);
            }
        }
    }
}