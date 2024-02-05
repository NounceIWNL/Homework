package Tasks05_02_2024;

import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {

        // #1
        check("\\+{0,1}d{3}\\u2028(\\d{3}\\)\\u2028\\d{3}\\(-)\\d{4}", "+111 (202) 555-0125", "b_dshjaf");
        // #2
        check("d{2}\\.{1}\\d{2}\\.{1}\\d{4}", "30.12.2023", "54214.432.2");
        // #3
        check("d{4}\\u2028\\d{4}\\u2028\\d{4}\\u2028\\d{4}", "4255 9148 4876 2546", "54214fda432.2");

    }

    static void check(String regex, String sTrue, String sFalse) {
        boolean bTrue = Pattern.matches(regex, sTrue);
        boolean bFalse = Pattern.matches(regex, sFalse);
        System.out.printf("%b %b%n", bTrue, bFalse);
    }
}

