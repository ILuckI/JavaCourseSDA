package Zajecia2701;

import java.util.Scanner;

public class DeSzyfrCezara {
    public static void main(String[] args) {

        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj wiadomosc do odkodowania:");
        char[] userChar = scr.nextLine().toUpperCase().toCharArray();
        System.out.println("Podaj kodowanie");
        int userKey = scr.nextInt();

        for (int i = 0; i < userChar.length; i++) {
            int letter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == userChar[i]) {
                    if (j < userKey) {
                        letter = (j + 26);
                    } else {
                        letter = j;
                    }
                    break;
                }
            }
            System.out.print(chars[(letter - userKey)]);
        }


    }
}


// A = 26 - userkay + 1 // a = z
// B = 26 - userkay + 2 // b = z;
// C = 26 - userkay + 3 // b = z;
// D = 26 - userkay + 4 // b = z;