package Tasks12_02_2024;

import java.util.Arrays;

// 0 1 2 3 4

public class Task01_01 {
    public static void main(String[] args) {

        int numbers = 5;
        int[] array = new int[numbers];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        recursion(array, null);

    }


    public static void recursion(int[] numbers, Integer currentIndex) {

        int[] arrayCopy = Arrays.copyOf(numbers, numbers.length);
        if (currentIndex != null) {
            int currentElementToSwap;
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("i = " + i);
                System.out.println("currentIndex=" + currentIndex);
                System.out.println('b');
                if (currentIndex == i)
                    continue;



                System.out.println(Arrays.toString(numbers));

                numbers = Arrays.copyOf(arrayCopy, arrayCopy.length);
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(i);
                System.out.println('a');
                currentIndex = i;
                recursion(arrayCopy, currentIndex);
            }

        }
    }
}
