package Tasks05_02_2024;

import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {

        // #1
//        check("\\+{0,1}d{3}\\u2028(\\d{3}\\)\\u2028\\d{3}\\(-)\\d{4}", "+111 (202) 555-0125");
        check("\\+?\\d{3}\\s\\(?\\d{3}\\)?\\s\\d{3}\\-?\\d{4}", "+111 (202) 555-0125");
        // #2
        check("\\d{2}\\.?\\d{2}\\.?\\d{4}", "30.12.2023");
        // #3
        check("\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}", "4255 9148 4876 2546");

    }

    static void check(String regex, String sTrue) {
        boolean bTrue = Pattern.matches(regex, sTrue);
        System.out.printf("%b%n", bTrue);
    }
}

