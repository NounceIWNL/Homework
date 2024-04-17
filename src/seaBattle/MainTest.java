package seaBattle;

/*
2. На поле размером nxm размещены корабли (2 трехпалубных, 3 двухпалубных, 4 однопалубных)
        [[0,0,0,1,1,0],
         [0,1,0,0,0,0],
         [0,1,0,1,0,0],
         [0,1,0,1,0,0]];

При ходе [2, 1] программа выдает число 3, т.к. подбит трехпалубный корабль
При ходе [1, 3] программа выдает число 0 (промах) и т.д.
Изменить условие так, чтобы каждый из кораблей мог "отразить" одну атаку,
выдав 0 при первом попадании в него.
Разработать алгоритм, который подобьет все корабли если не за минимальное,
то за некоторое удовлетворительное число ходов.

public class SeaBattle {
    public static void main(String[] args) {

    }
}
 */


import java.util.Arrays;
import java.util.Random;

public class MainTest {
    public static int[][] table;

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;


        table = getTable(table);

        for (int[] anArr : table) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }


        System.out.println("-----------");
//                                                                                    [[0,0,1,1,1,0,0,0,0,0],
//                                                                                     [0,0,0,0,0,0,0,0,1,0],
//                                                                                     [0,0,0,0,1,1,0,0,0,0],
//                                                                                     [0,0,0,0,0,0,0,0,0,0]
//                                                                                     [0,0,1,1,0,0,0,0,0,0]
//                                                                                     [0,0,0,0,0,0,0,1,0,0]
//                                                                                     [0,0,0,0,0,0,0,1,0,0]
//                                                                                     [0,0,1,0,0,1,0,0,0,0]
//                                                                                     [0,0,0,0,0,0,0,0,1,0]
//                                                                                     [0,0,1,1,1,0,0,0,0,0]];

        while (true) {
            boolean checkToStop = true;
            int cols = random.nextInt(10);
            int rows = random.nextInt(10);
            int numberToCheck = 1;
            if (table[cols][rows] == 0) {
                System.out.println("Missed!");
                table[cols][rows] = 3;
                count++;
            }
            if (table[cols][rows] == 3) {
                continue;
            }
            if (table[cols][rows] == 1) {
                System.out.println("Ship has dodged the attack!");
                count++;
                table[cols][rows] = 2;
                if (rows < 9) {
                    if (table[cols][rows + 1] == 1) {
                        table[cols][rows + 1] = 2;
                    }
                }
                if (rows < 8) {
                    if (table[cols][rows + 2] == 1) {
                        table[cols][rows + 2] = 2;
                    }
                }
                if (rows > 0) {
                    if (table[cols][rows - 1] == 1) {
                        table[cols][rows - 1] = 2;
                    }
                }
                if (rows > 1) {
                    if (table[cols][rows - 2] == 1) {
                        table[cols][rows - 2] = 2;
                    }
                }
                if (cols < 9) {
                    if (table[cols + 1][rows] == 1) {
                        table[cols + 1][rows] = 2;
                    }
                }
                if (cols < 8) {
                    if (table[cols + 2][rows] == 1) {
                        table[cols + 2][rows] = 2;
                    }
                }
                if (cols > 0) {
                    if (table[cols - 1][rows] == 1) {
                        table[cols - 1][rows] = 2;
                    }
                }
                if (cols > 1) {
                    if (table[cols - 2][rows] == 1) {
                        table[cols - 2][rows] = 2;
                    }
                }
                if (table[cols][rows] == 2) {
                    System.out.println("Ship has been destroyed!");
                    count++;
                    if (rows < 9 && (cols < 9 && cols > 0)) {
                        if (table[cols][rows + 1] == 2) {
                            table[cols][rows + 1] = 3;
                            table[cols + 1][rows] = 3;
                            table[cols - 1][rows] = 3;
                        }
                    }
                    if (rows < 8 && (cols < 9 && cols > 0)) {
                        if (table[cols][rows + 2] == 2) {
                            table[cols][rows + 1] = 3;
                            table[cols + 1][rows] = 3;
                            table[cols - 1][rows] = 3;
                        }
                    }
                    if (rows > 0 && (cols < 9 && cols > 0)) {
                        if (table[cols][rows - 1] == 2) {
                            table[cols][rows - 1] = 3;
                            table[cols + 1][rows] = 3;
                            table[cols - 1][rows] = 3;
                        }
                    }
                    if (rows > 1 && (cols < 9 && cols > 0)) {
                        if (table[cols][rows - 2] == 2) {
                            table[cols][rows - 1] = 3;
                            table[cols + 1][rows] = 3;
                            table[cols - 1][rows] = 3;
                        }
                    }
                    if (cols < 9 && (rows < 9 && rows > 0)) {
                        if (table[cols + 1][rows] == 2) {
                            table[cols + 1][rows] = 3;
                            table[cols][rows - 1] = 3;
                            table[cols][rows + 1] = 3;
                        }
                    }
                    if (cols < 8 && (rows < 9 && rows > 0)) {
                        if (table[cols + 2][rows] == 2) {
                            table[cols + 1][rows] = 3;
                            table[cols][rows - 1] = 3;
                            table[cols][rows + 1] = 3;
                        }
                    }
                    if (cols > 0 && (rows < 9 && rows > 0)) {
                        if (table[cols - 1][rows] == 2) {
                            table[cols - 1][rows] = 3;
                            table[cols][rows - 1] = 3;
                            table[cols][rows + 1] = 3;
                        }
                    }
                    if (cols > 1 && (rows < 9 && rows > 0)) {
                        if (table[cols - 2][rows] == 2) {
                            table[cols - 1][rows] = 3;
                            table[cols][rows - 1] = 3;
                            table[cols][rows + 1] = 3;
                        }
                    }
                    if ((cols < 9 && cols > 0) && (rows < 9 && rows > 0)) {
                        table[cols][rows + 1] = 3;
                        table[cols][rows - 1] = 3;
                        table[cols + 1][rows] = 3;
                        table[cols - 1][rows] = 3;

                    }
                }
            }
            for (int[] ints : table) {
                for (int anInt : ints) {
                    if (numberToCheck == anInt) {
                        checkToStop = false;
                    }
                }
            }
            if(checkToStop) {
                break;
            }
        }
        for (int[] anArr : table) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        System.out.println("You finished the game with " + count + " moves!");
    }

    public static int[][] getTable(int[][] table) {
        table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
            }
        }
        //трехпалубный
        table[0][2] = 1;
        table[0][3] = 1;
        table[0][4] = 1;
        //однопалубный
        table[1][8] = 1;
        //двухпалубный
        table[2][4] = 1;
        table[2][5] = 1;
        //двухпалубный
        table[4][2] = 1;
        table[4][3] = 1;
        //двухпалубный
        table[5][7] = 1;
        table[6][7] = 1;
        //однопалубный
        table[7][2] = 1;
        //однопалубный
        table[7][5] = 1;
        //однопалубный
        table[8][8] = 1;
        //трехпалубный
        table[9][2] = 1;
        table[9][3] = 1;
        table[9][4] = 1;
        return table;
    }
}



