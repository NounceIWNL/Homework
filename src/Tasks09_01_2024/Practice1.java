package Tasks09_01_2024;

public class Practice1 {
    public static void main(String[] args) {
        double x = 0.5;

        double sum = 1;

        double a = 1;

        double eps = 1e-5;

        int i = 2;

        while (Math.abs(a) > eps) {
//        for (int i = 1; i < 20; i++) {
            a *= -x * (3 * i + 1) / (2 * i);
            sum += a;
            i++;
            System.out.println();


        }
        System.out.println(sum);
        System.out.println(1 / Math.sqrt(Math.pow(1 + x, 3)));
    }
}
