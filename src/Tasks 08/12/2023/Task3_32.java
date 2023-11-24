package Tasks 08.12.2023;



public class Task3_32 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        boolean a = (x <= -2) && (y >= 1);
        System.out.println(a);
        boolean b = (y >= -2) && (y <= 1.5);
        System.out.println(b);
        boolean c = (y <= 4) && ((x >= 1) && (x <= 2));
        System.out.println(c);
        boolean d = ((y <= 4) && (y >= 2)) && (x >= 1);
        System.out.println(d);


    }
}
