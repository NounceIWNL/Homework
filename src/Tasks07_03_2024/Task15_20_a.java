package Tasks07_03_2024;

// мною за основу было взято условие В , но для выбранного текста я увеличил количество пробелов до 15

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task15_20_a {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks07_03_2024\\JavaHomeworkText.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int maxLength = 0;
        String longestString = null;
        while ((st = br.readLine()) != null) {
            int count = st.length();
            if (count > maxLength) {
                maxLength = count;
                longestString = st;
            }
        }
        System.out.printf("The longest string has a %d characters.\n", maxLength);
        System.out.println(longestString);
    }
}