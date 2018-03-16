package Zajecia2701;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int[] array = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] finalArray = new int[array.length];
        int[] secondArray = new int[]{50, 20, 10, 5, 2, 1};
        int[] secondFinalArray = new int[array.length];
        System.out.print("Podaj wartosc: ");
        int value = scr.nextInt();
        System.out.print("Podaj wartosc po przecinku: ");
        int secendValue = scr.nextInt();
        int aktualnyNominal = 0;

        count(value, array, finalArray, aktualnyNominal);
        count(secendValue, secondArray, secondFinalArray, aktualnyNominal);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Banktot %d wyplacony %d \n", array[i], finalArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Groszy %d wyplacono %d \n", array[i], finalArray[i]);
        }

    }

    public static void count(int value, int[] array, int[] finalArray, int aktualnyNominal) {
        while (value > 0) {
            if (value >= array[aktualnyNominal]) {
                value -= array[aktualnyNominal];
                finalArray[aktualnyNominal]++;
            } else {
                aktualnyNominal++;
            }
        }
    }
}
