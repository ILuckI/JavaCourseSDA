//        Zadanie 12:
//        Pobierz	od	użytkownika	3	liczby	całkowite:	a, b, c  i	wypisz	true,
// 	      gdy	spełnione	jest	równanie:  a + b = c.

import java.util.Scanner;

public class weekend3homework12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int uScr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Podaj %d liczbe calkowita :",i);
            uScr[ i] =scr.nextInt();

        }
        if (uScr[0] + uScr[1] == uScr[2]){
            System.out.println("a + b = true");
        }
        else
            System.out.println("a + b = false");
    }
}
