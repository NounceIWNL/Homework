package Task22_02_2024;

import java.util.*;

public class PhoneNumbers {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        // Заполнение телефонной книги
        phoneBook.put("Walter", "89123456789");
        phoneBook.put("Mike", "89234567890");
        phoneBook.put("Jane", "89345678901");
        phoneBook.put("Joe", "56785439012");
        phoneBook.put("Keil", "42130900212");


        char digit = '8';


        List<String> phonesWithDigit = new ArrayList<>();


        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().charAt(0) == digit) {
                phonesWithDigit.add(entry.getValue());
            }
        }


        Collections.sort(phonesWithDigit);


        System.out.println("Phone numbers starting with digit " + digit + ":");
        for (String phone : phonesWithDigit) {
            System.out.println(phone);
        }
    }
}
