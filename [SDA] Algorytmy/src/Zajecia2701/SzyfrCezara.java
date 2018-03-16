package Zajecia2701;

import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {

        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj wiadomosc do zakodowania:");
        char[] userChar = scr.nextLine().toUpperCase().toCharArray();
        System.out.println("Podaj kodowanie");
        int userKey = scr.nextInt();

        for (int i = 0; i < userChar.length; i++) {
            int letter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == userChar[i]) {
                    letter = j;
                    break;
                }
            }
            System.out.print(chars[(letter + userKey )% 26]);
        }
    }

}

