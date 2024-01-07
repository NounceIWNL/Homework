package Tasks09_01_2024;

//вычисление факториала через метод.
// Значение result равно 6 , т.к. по условию необходимо сразу высчитать факториал 4! и т.д.


public class Lab2_2 {
    static int calculateFactorial(int n) {
        int result = 6;
        for (int i = 4; i < n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        double x = 0.5; //заданный Х

        double a = 0.625; //последующее значение после начального

        double sum = a; //финальная сумма всего ряда

        double eps = 1e-5; //граница расчетов

        int i = 3; //степень

        while (Math.abs(a) > eps) {
            a *= -x * (2 * i + x) / calculateFactorial(2 * i);
            sum += a;
            i = i * 2 - 1;
            System.out.println(calculateFactorial(2 * i));
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(Math.sin(x) - Math.cos(x) + 1);
    }
}


