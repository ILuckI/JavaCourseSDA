package Zajecia2701.Sortowania;

import java.util.Scanner;

public class CiagABC {
    public static void main(String[] args) {

        char[] charsArray = {'A', 'B', 'C'};
        String[] stringArray = new String[27];
        StringBuilder sb = new StringBuilder();
        int couter = 0;

        for (int i = 0; i < charsArray.length; i++) {
            for (int j = 0; j < charsArray.length; j++) {
                for (int k = 0; k < charsArray.length; k++) {
                    sb.append(charsArray[i]).append(charsArray[j]).append(charsArray[k]);
                    stringArray[couter] = sb.toString();
                    sb.setLength(0);                        // sb.setLenght(0) - czysci string buildera
                    couter++;
                }
            }
        }
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj ilosc ciagow:");
        int n = Integer.parseInt(scr.nextLine());           // bezpieczna metoda pobierania intow od usera!

        String[] inputUser = new String[n];
        for (int i = 0; i < n; i++) {
            inputUser[i] = scr.nextLine().toUpperCase();
        }
        int[] counterArray = new int[27];
        for (int i = 0; i < inputUser.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if (stringArray[j].equals(inputUser[i])) {
                    counterArray[j]++;
                    break;
                }

            }
        }
        for (int i = 0; i < counterArray.length; i++) {
            while (counterArray[i] > 0) {
                System.out.print(stringArray[i] + " ");
                counterArray[i]--;
            }

        }

    }
}
