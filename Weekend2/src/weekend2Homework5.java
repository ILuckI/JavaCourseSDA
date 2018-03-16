import java.util.Scanner;

public class weekend2Homework5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int userNumbers[] = new int[3];
        System.out.printf("Podaj liczbe a: ");
        int a = scr.nextInt();
        System.out.printf("Podaj liczbe b: ");
        int b = scr.nextInt();
        System.out.printf("Podaj liczbe c: ");
        int c = scr.nextInt();

        System.out.println("Najwieksza wartosc: " + maxValue(a, b, c));
        System.out.println("Najwieksza wartosc: " + minValue(a, b, c));
    }

    public static int maxValue(int x, int y, int z) {
        for (int i = 0; i < 3; i++)
            if (x > y && x > z)
                return x;
            else if (y > x && y > z)
                return y;
            else if (z > x && z > y)
                return z;

        return x;
    }
    public static int minValue(int x, int y, int z) {
        for (int i = 0; i < 3; i++)
            if (x < y && x < z)
                return x;
            else if (y < x && y < z)
                return y;
            else if (z < x && z < y)
                return z;

        return x;
    }
}