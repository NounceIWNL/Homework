package Tasks09_01_2024;

public class Lab2_3 {
    public static void main(String[] args) {
        double x = 0.5; //заданный Х

        double sum = 0.125; //финальная сумма всего ряда

        double a = 0.125; //последующее значение после начального

        double eps = 1e-5; //граница расчетов

        int i = 1; //степень

        while (Math.abs(a) > eps) {
            a *= -x * (4 * i - 3) / (4 * i);
            sum += a;
            i++;
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(1 - ( 1 / Math.pow(1 + x, 0.25 )));
    }
}