package Task22_02_2024;

import java.util.*;

public class PhoneNumbers {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        // Заполнение телефонной книги
        phoneBook.put("Walter", "89123456789");
        phoneBook.put("Mike", "89234567890");
        phoneBook.put("Jane", "89345678901");

        // Определенная цифра, которой должен начинаться номер
        char digit = '8';

        // Создание списка для хранения номеров, начинающихся с определенной цифры
        List<String> phonesWithDigit = new ArrayList<>();

        // Поиск и добавление номеров в список
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().charAt(0) == digit) {
                phonesWithDigit.add(entry.getValue());
            }
        }

        // Сортировка номеров по фамилии
        Collections.sort(phonesWithDigit);

        // Вывод отсортированных номеров
        System.out.println("Номера телефонов, начинающиеся с цифры " + digit + ":");
        for (String phone : phonesWithDigit) {
            System.out.println(phone);
        }
    }
}
