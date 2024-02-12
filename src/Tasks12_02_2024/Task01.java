package Tasks12_02_2024;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
//        System.out.println(array(4));
//
//    }
//
//    public static int array(int number) {
//        if (number == 1)
//            return 1;
//        return number * array(number - 1);
//    }
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        int currentMaxIndex = 0;
        int currentMinIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(i - (i + 1)) == 1) {
                currentMinIndex = i;
                min = arr[i];
            }

        }
        int temp = arr[currentMinIndex];
        arr[currentMinIndex] = arr[currentMaxIndex];
        arr[currentMaxIndex] = temp;


        System.out.println(Arrays.toString(arr));
    }
}
