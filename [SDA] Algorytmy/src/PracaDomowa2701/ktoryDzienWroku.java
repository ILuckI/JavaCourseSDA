package Zajecia2701.PracaDomowa2701;

import java.util.Scanner;

public class ktoryDzienWroku {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("DD MM RRRR");

        while (true) {
            int DD = scanner.nextInt();
            int MM = scanner.nextInt();
            int RRRR = scanner.nextInt();
            String temp1 = "0" + DD;
            String temp2 = "0" + MM;
            if (czyPrzestepny(RRRR) && DD <= dniMiesiaca[MM]) {
                if (DD < 10 && MM < 10) {
                    System.out.println(temp1 + " " + temp2 + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));
                } else if (MM < 10) {
                    System.out.println(DD + " " + temp2 + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));
                } else
                    System.out.println(DD + " " + MM + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));
            } else if (DD <= dniMiesiaca[MM]) {
                if (DD < 10 && MM < 10) {
                    System.out.println(temp1 + " " + temp2 + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));
                } else if (MM < 10) {
                    System.out.println(DD + " " + temp2 + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));
                } else
                    System.out.println(DD + " " + MM + " " + RRRR + " =>" + dzienRoku(DD, MM, RRRR));

            } else {
                if (DD < 10 && MM < 10) {
                    System.out.println(temp1 + " " + temp2 + " " + RRRR + " =>" + "nie ma takiego dnia");
                } else if (MM < 10) {
                    System.out.println(DD + " " + temp2 + " " + RRRR + " =>" + "nie ma takiego dnia");
                } else
                    System.out.println(DD + " " + MM + " " + RRRR + " =>" + "nie ma takiego dnia");

            }

        }
    }

    public static boolean czyPrzestepny(int rok) {
        return ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0));
    }

    public static int liczbaDniNaMiesiac[] = {0, 31, 59, 90, 120, 151,
            181, 212, 243, 273, 304, 334};
    public static int dniMiesiaca[] = {0, 31, 29, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};

    public static int dzienRoku(int dzien, int miesiac, int rok) {
        int sumaDniOdPoczatkuRoku;
        sumaDniOdPoczatkuRoku = dzien + liczbaDniNaMiesiac[miesiac - 1];
        if ((miesiac > 2) && (czyPrzestepny(rok) == true)) {
            sumaDniOdPoczatkuRoku++;
        }
        return sumaDniOdPoczatkuRoku;
    }
}
