import java.util.Scanner;

public class Zadanie2 {
    static Scanner scr = new Scanner(System.in);
    private static double z, s, x, y;


    public static void main(String[] args) {

        usersZandS();
        results();
    }
    public static void usersZandS(){
        System.out.println("Podaj z:");
        z = scr.nextDouble();
        System.out.println("Podaj s:");
        s = scr.nextDouble();

    }
    public static void results (){
        y = z / ( s + 1);
        x = s * y;
        System.out.print("x = " + x + " ,y = " + y);

    }

}
