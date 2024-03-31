import java.util.*;

public class CollectionsPractice2 {
    public static void main(String[] args) {
        SortedMap<String, Integer> phoneBook = new TreeMap<>();
        phoneBook.put("White", 1234);
        phoneBook.put("Black", 2234);
        phoneBook.put("Pink", 4312);
        phoneBook.put("Angels", 2134);
        phoneBook.put("Purple", 1423);
        phoneBook.put("Red", 1344);
        phoneBook.put("Orange", 3324);

        System.out.println(phoneBook.values());
        System.out.println(phoneBook.keySet());

//        for (int i = 0; i < phoneBook.values().size(); i++) {
//            if ((int) phoneBook.values().toArray()[i] / 1000 == 1) {
//                System.out.println(phoneBook.keySet().toArray()[i] + " " + phoneBook.values().toArray()[i]);
//            }
//        }

        for (int i = 0; i < phoneBook.values().size(); i++) {
            char check = '1';
            if (phoneBook.values().toArray()[i].toString().charAt(0) == check) {
                System.out.println(phoneBook.keySet().toArray()[i] + " " + phoneBook.values().toArray()[i]);
            }
        }
    }
}


