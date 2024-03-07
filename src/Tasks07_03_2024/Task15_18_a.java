package Tasks07_03_2024;

// мною за основу было взято условие В , но для выбранного текста я увеличил количество пробелов до 15

import java.io.*;

public class Task15_18_a {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a\\Downloads\\JavaMarathon2021\\Homework\\src\\Tasks07_03_2024\\JavaHomeworkText.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            char[] charArray = st.toCharArray();
            int count = 0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == ' ') {
                    count++;
                }
            }
            if (count < 15 && !st.isEmpty()) {
                System.out.println(st);
            }
        }
    }
}