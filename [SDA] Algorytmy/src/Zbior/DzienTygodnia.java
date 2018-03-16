package Zbior;


import java.util.Scanner;

public class DzienTygodnia {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String[] daysOfWeek = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};
        System.out.println("Podaj dzien tygodnia i po spacji ilosc dni do przodu :");
        String userData = scr.nextLine();
        String[] split = userData.split(" ");
        String userDay = split[0];
        int moveDay = Integer.valueOf(split[1]);

        int letter = 0;
        for (int j = 0; j < daysOfWeek.length; j++) {
            if (daysOfWeek[j].equals(userDay)) {
                letter = j;
                break;
            }
        }
        System.out.print(daysOfWeek[(letter + moveDay) % 7]);
    }
}

