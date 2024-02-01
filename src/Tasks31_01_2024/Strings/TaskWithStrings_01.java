package Tasks31_01_2024.Strings;

public class TaskWithStrings_01 {
    public static void main(String[] args) {
        String first = "интерфейс";
        System.out.println("Исходное слово: " + first);
        char e = first.charAt(6);
        char c = first.charAt(8);

        int start = 0;
        int end = 5;
        char[] dst = new char[end - start];
        first.getChars(start, end, dst, 0);
        String firstString = String.valueOf(dst);

        char f = first.charAt(5);
        char i = first.charAt(0);
        char t = first.charAt(2);
        char n = first.charAt(1);
        char e2 = first.charAt(3);
        char s = first.charAt(8);

        System.out.println(firstString + e + c);
        System.out.println("" + f + i + t + n + e2 + s);
    }
}
