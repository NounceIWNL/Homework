package Tasks09_01_2024;

public class Practice {
    public static void main(String[] args) {
        double x = 0.5; //заданный Х

        double sum = x; //финальная сумма всего ряда

        double a = x; //последующее значение после начального

        double eps = 1e-5; //граница расчетов

        int i = 2; //степень

        while (Math.abs(a) > eps) {
            a *= -x * (3 * i - 4) / (3 * i);
            sum += a;
            i++;
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(3 * Math.cbrt(1 + x) - 3);
    }
}
