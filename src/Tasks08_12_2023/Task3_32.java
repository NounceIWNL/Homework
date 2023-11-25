package Tasks08_12_2023;

public class Task3_32 {
    public static void main(String[] args) {
        double x = 1, y = 1;
        boolean a = (x <= -2) && (y >= 1);
        System.out.println(a);
        boolean b = (y >= -2) && (y <= 1.5);
        System.out.println(b);
        boolean c = (y <= 4) && ((x >= 1) && (x <= 2));
        System.out.println(c);
        boolean d = ((y <= 4) && (y >= 2)) && (x >= 1);
        System.out.println(d);
        boolean e = ((y >= 0) && (x >= 2)) || ((y <= -1) && (x >= 1));
        System.out.println(e);
        boolean f = ((y >= 1) && (x >= 2)) || ((y <= -1.5) && (x >= 2));
        System.out.println(f);
        boolean g = ((y <= -1) && (y >= -2)) && ((x >= 1) && (x <= 3));
        System.out.println(g);
        boolean h = ((y <= 1.5) && (y >= 0.5)) || ((x >= 2));
        System.out.println(h);
    }
}
