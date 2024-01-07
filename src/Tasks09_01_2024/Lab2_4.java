package Tasks09_01_2024;

public class Lab2_4 {
    static int calculateFactorial(int n) {
        int result = 120;
        for (int i = 6; i < n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        double x = 0.5; //заданный Х

        double a = 0.03125; //последующее значение после начального

        double sum = a; //финальная сумма всего ряда

        double eps = 1e-5; //граница расчетов

        int i = 4; //степень

        while (Math.abs(a) > eps) {
            a *= -x * (2 * i + 1) / calculateFactorial(2 * i + 2);
            sum += a;
            i *= 2;
            System.out.println(calculateFactorial(2 * i + 2));
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(0.5 + ((1 - Math.cos(x) - Math.sin(x))/(x * x)));
    }
}
