package Tasks09_01_2024;

public class Lab2_5 {
    public static void main(String[] args) {
        double x = 0.5; //заданный Х

        double sum = 0.167; //финальная сумма всего ряда

        double a = 0.167; //последующее значение после начального

        double eps = 1e-5; //граница расчетов

        int i = 1; //степень

        while (Math.abs(a) > eps) {
            a *= -x * (3 * i - 2) / (3 * i);
            sum += a;
            i++;
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(1 - ( 1 / Math.cbrt(1 + x)));
    }
}