package Tasks08_12_2023;

public class Task3_34 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        x1 = 1; y1 = 1;
        x2 = 3; y2 = 3;

        //Rook
        if (x1 == x2 || y1 == y2)
            System.out.println(true);
        //Bishop
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2))
            System.out.println(true);
        //King
        if (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1)
            System.out.println(true);
        //Queen
        if ((x1 == x2 || y1 == y2) || (Math.abs(x1 - x2) == Math.abs(y1 - y2)))
            System.out.println(true);
        //Pawn
        if ((y2 - y1) == 1) //white one
            System.out.println(true);
        if (Math.abs(x1 - x2) == 1 && (y2 - y1) == 1) // white one
            System.out.println(true);
        if ((y2 - y1) == -1) //black one
            System.out.println(true);
        if (Math.abs(x1 - x2) == 1 && (y2 - y1) == -1) // black one
            System.out.println(true);
        //Knight
        if (((Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2)) || ((Math.abs(y2 - y1) == 1 || Math.abs(x2 - x1) == 2)))
            System.out.println(true);
    }
}
