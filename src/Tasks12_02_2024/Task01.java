package Tasks12_02_2024;

public class Task01 {
    public static void main(String[] args) {
        array(4);

    }

    public static int array(int number) {
        if (number == 0)
            System.out.println(number);
        array(number - 1);
        return number;
    }
}
