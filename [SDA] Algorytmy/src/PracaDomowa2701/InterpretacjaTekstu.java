package Zajecia2701.PracaDomowa2701;

import java.util.Scanner;

public class InterpretacjaTekstu {
    public static void main(String[] args) {
        System.out.println("Podaj odpowiedzi Kuba, Zenek, Bogdan: ");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();

        String[] podzial = (napis.split(" "));
        char[] p1 = String.format(podzial[0]).toCharArray();
        char[] p2 = String.format(podzial[1]).toCharArray();
        char[] p3 = String.format(podzial[2]).toCharArray();

        System.out.println();
        int count = 0;
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {
                if (i == j && p1[i] != p2[j]) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        System.out.println(p1[i] + ":" + p2[j] + "[" + i + "," + j + "]");
                    }
                    if (i % 2 != 0 && j % 2 != 0)
                        System.out.println(p1[i] + ":" + p2[j] + "[" + i + "," + j + "]");
                    count++;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p3.length; j++) {
                if (i == j && p1[i] != p3[j]) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        System.out.println(p1[i] + ":" + p3[j] + "" + "[" + i + "," + j + "]");
                    }
                    if (i % 2 != 0 && j % 2 != 0)
                        System.out.println(p1[i] + ":" + p3[j] + "" + "[" + i + "," + j + "]");
                    count++;
                }
            }
        }
        System.out.println("Zenek i Bogdan max: " + count);
    }
}
