package Tasks09_01_2024;

public class Lab2_2 {
    public static void main(String[] args) {
        double x = 0.5; //заданный Х

        double a = x; //последующее значение после начального

        double sum = x; //финальная сумма всего ряда

        double eps = 1e-5; //граница расчетов

        int i = 2; //степень

        int factorial = 2;

        while (Math.abs(a) > eps) {
            for (int j = 1; j < ; j++) {


                a *= -x * (3 * i - 4) / (3 * i);
                sum += a;
                i *= 2 - 1;
                System.out.println();
            }
        }
        System.out.println(sum);
        System.out.println(Math.sin(x) - Math.cos(x) + 1);
    }
}
