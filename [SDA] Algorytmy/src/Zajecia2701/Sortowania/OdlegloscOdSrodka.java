package Zajecia2701.Sortowania;

import java.util.Scanner;

public class OdlegloscOdSrodka {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = Integer.parseInt(scr.nextLine());

        int[][] input = new int[n][3];  // wejsciowa tablica
        double[][] sort = new double[n][2];   // tablica posortowana

        for (int i = 0; i < n; i++) {
            String inputUser = scr.nextLine();
            String[] inputSpliter = inputUser.split(" ");
            input[i][0] = Integer.parseInt(inputSpliter[0]);    // nazwa
            input[i][0] = Integer.parseInt(inputSpliter[1]);    // x
            input[i][0] = Integer.parseInt(inputSpliter[2]);    // y

            sort[i][0] = input[i][0];
            sort[i][1] = policzOdlegloscWzgledemSrodkaOkregu(input[i][1], input[i][2]);
        }

        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j][1] > sort[j + 1][1]) {
                    double temp = sort[j][0];
                    sort[j + 1][0] = sort[j][0];
                    sort[j][0] = temp;

                    temp = sort[j][1];
                    sort[j + 1][1] = sort[j][1];
                    sort[j][1] = temp;

                }
            }

        }
        for (int i = 0; i <input.length ; i++) {
            int nazwa = (int) sort[i][0];
            for (int j = 0; j <input.length ; j++) {
                if (nazwa == input[j][0]){
                    System.out.printf("%d, %d, %d,\n", input[j][0],input[j][1],input[j][2]);
                }

            }

        }

    }

    public static double policzOdlegloscWzgledemSrodkaOkregu(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
