package Tasks28_12_2023;

public class Task5_75 {
    public static void main(String[] args) {

        double summary = 0;
        for (int i = 4; i < 1025; i = i * 2) {
            summary += i;
            System.out.println(i);
        }
        System.out.println(summary);
    }
}
