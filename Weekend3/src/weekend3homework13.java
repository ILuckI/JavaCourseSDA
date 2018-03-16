//          Zadanie 13:
//          Napisz	program,	który	pobierze	od	użytkownika	liczbę	sekund,	a	następnie	wyświetli	godzinę
//          w	formacie	HH:MM:SS	np.	dla	86399 poprawnym	wynikiem	jest	23:59:59. HINT:	zapoznaj	się
//          z	dokumentacją	metody	Math.floorDiv.

import java.util.Scanner;

public class weekend3homework13 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj ilosc sekund :");
        int sec = scr.nextInt();

        int hours = Math.floorDiv(sec,3600);
        int secleft = sec % 3600;
        int min = Math.floorDiv(sec,60);




        System.out.printf("%d:%d:%d",hours,min,secleft);
    }
}
