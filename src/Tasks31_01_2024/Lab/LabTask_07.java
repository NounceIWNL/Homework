package Tasks31_01_2024.Lab;

public class LabTask_07 {
    public static void main(String[] args) {
        int size = 5;
        int rows = size * 2; // строки
        int cols = size * 2 - 1; // столбцы

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                arr[i][j] = 5;
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (arr[i][j] == 0)
                    System.out.print("  ");
                else System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
