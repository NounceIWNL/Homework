package Tasks09_01_2024;

public class Lab2_7 {
    public static void main(String[] args) {
        double x = 0.5; //заданный Х

        double sum = 1; //финальная сумма всего ряда

        double a = 1; //последующее значение после начального

        double eps = 1e-5; //граница расчетов

        int i = 1; //степень

        while (Math.abs(a) > eps) {
//        for (int i = 1; i < 20; i++) {
            a *= -x * (2 * i + 1) / (2 * i);
            sum += a;
            i++;
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(1 / Math.sqrt(Math.pow(1 + x, 3)));
    }
}
