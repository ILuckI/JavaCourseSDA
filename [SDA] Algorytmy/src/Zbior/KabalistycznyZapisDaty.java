package Zbior;

import java.util.HashMap;
import java.util.Scanner;

public class KabalistycznyZapisDaty {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Napisz cos fajnego:");
        char[] userString = scr.nextLine().toUpperCase().toCharArray();

        HashMap<Character, Integer> kabal = new HashMap<>();
        kabal.put('A', 1);
        kabal.put('B', 2);
        kabal.put('C', 3);
        kabal.put('D', 4);
        kabal.put('E', 5);
        kabal.put('F', 6);
        kabal.put('G', 7);
        kabal.put('H', 8);
        kabal.put('I', 9);
        kabal.put('K', 10);
        kabal.put('L', 20);
        kabal.put('M', 30);
        kabal.put('N', 40);
        kabal.put('O', 50);
        kabal.put('P', 60);
        kabal.put('Q', 70);
        kabal.put('R', 80);
        kabal.put('S', 90);
        kabal.put('T', 100);
        kabal.put('V', 200);
        kabal.put('X', 300);
        kabal.put('Y', 400);
        kabal.put('Z', 500);

        int suma = 0;
        for (int i = 0; i < userString.length; i++) {
            suma += kabal.get(userString[i]);
        }
        System.out.println(suma);
    }
}
