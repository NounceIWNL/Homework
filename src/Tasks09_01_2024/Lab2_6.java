package Tasks09_01_2024;

public class Lab2_6 {
    static int calculateFactorial(int n) {
        int result = 6;
        for (int i = 4; i < n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        double x = 0.5; //заданный Х

        double a = 4; //последующее значение после начального

        double sum = a; //финальная сумма всего ряда

        double eps = 1e-5; //граница расчетов

        int i = 2; //степень

        while (Math.abs(a) > eps) {
            a *= -x / calculateFactorial(2 * i + 2);
            sum += a;
            i *= 2;
            System.out.println(calculateFactorial(2 * i + 2));
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println((Math.cos(x) / (x * x)) + 0.5);

    }
}
