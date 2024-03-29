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

//        System.out.println(phoneBook);

        List<SortedMap<String, Integer>> phoneBookToSort = new ArrayList<>();

        phoneBookToSort.add(phoneBook);


//        System.out.println(phoneBookToSort);

//        String compareChar = "1";

        Collection<Integer> values = phoneBook.values();
        System.out.println(values);


        for (int i = 0; i < values.size(); i++) {
//            if () {
//                System.out.println(i);
//            }
        }
    }
    static class BookComparator implements Comparator<SortedMap<String, Integer>> {

        public int compare(SortedMap<String, Integer> a, SortedMap<String, Integer> b) {
            if (a.containsValue(String.valueOf(1))) {
                return 1;
            } else if (a.get("Year") < b.get("Year")) {
                return -1;
            } else if (a.get("Year").equals(b.get("Year"))) {
                return 0;
            }
            return 0;
        }
    }
}


