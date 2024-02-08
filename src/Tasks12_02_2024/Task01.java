package Tasks12_02_2024;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(array(4));

    }

    public static int array(int number) {
        if (number == 1)
            return 1;
        return number * array(number - 1);
    }
}
