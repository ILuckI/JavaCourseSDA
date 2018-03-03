import java.util.Scanner;

public class Zadanie4 {
    static Scanner scr = new Scanner(System.in);
    private static int x, y, z, radek, jarek;


    public static void main(String[] args) {
        usersXYZ();
results();
    }

    public static void usersXYZ()


    {
        System.out.println("Podaj x:");
        x = scr.nextInt();
        System.out.println("Podaj y:");
        y = scr.nextInt();
        System.out.println("Podaj z:");
        z = scr.nextInt();

    }

    public static void results() {
        jarek = (z - x - (2 * y)) / 2;
        radek = jarek + x;

        System.out.println( "Radek ma: " + radek + " Jarek ma: "+ jarek );
    }
}
