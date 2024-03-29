import java.util.*;

public class CollectionsPractice1 {
    public static void main(String[] args) {
        SortedMap<String, Integer> book1 = new TreeMap<>();
        book1.put("Year", 1990);

        SortedMap<String, Integer> book2 = new TreeMap<>();
        book2.put("Year", 1992);

        SortedMap<String, Integer> book3 = new TreeMap<>();
        book3.put("Year", 1995);

        SortedMap<String, Integer> book4 = new TreeMap<>();
        book4.put("Year", 1988);

        SortedMap<String, Integer> book5 = new TreeMap<>();
        book5.put("Year", 1987);

        SortedMap<String, Integer> book6 = new TreeMap<>();
        book6.put("Year", 1988);

        ArrayList<SortedMap<String, Integer>> books = new ArrayList<>();
        books.add(book1);
        books.add((book2));
        books.add((book3));
        books.add((book4));
        books.add((book5));
        books.add((book6));

        books.sort(new BookComparator());


        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).get("Year") < 1990) {
                System.out.println(books.get(i));
            }
        }
    }

    static class BookComparator implements Comparator<SortedMap<String, Integer>> {

        public int compare(SortedMap<String, Integer> a, SortedMap<String, Integer> b) {
            if (a.get("Year") > b.get("Year")) {
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


