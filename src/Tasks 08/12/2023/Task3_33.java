package Tasks

public class Task3_33 {
    public static void main(String[] args) {
        double x = 1, y = 1;
        boolean a = (x <= -1) && (y <= -2);
        System.out.println(a);
        boolean b = (y >= 1) || (y <= -3);
        System.out.println(b);
        boolean c = (y >= 1) || ((y <= -3) && (y >= -4));
        System.out.println(c);
        boolean d = ((y <= 1.5) && (y >= -0.5)) && ((x >= -1) && (x <= 1.5));
        System.out.println(d);
        boolean e = ((y <= 4) && (y >= 2)) && ((x >= 1) && (x <= 4));
        System.out.println(e);
        boolean f = ((y >= 1) && (x <= -1)) || ((x >= 2) && (y >= 1));
        System.out.println(f);
        boolean g = ((y <= 1) && (y >= -3)) && ((x >= 1) && (x <= 3));
        System.out.println(g);
        boolean h = ((y >= -2) && ((x >= 1) && (x <= 2.5))) || (y >= 1.5);
        System.out.println(h);
        
    }
}
