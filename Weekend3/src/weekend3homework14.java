//        Zadanie 14:
//        Napisz program, który	pobierze od	użytkownika	liczbę	n ∈ [1, 10],a następnie wygeneruje	i
//        wypełni tablicę dwuwymiarową zgodnie ze wzorem (n=5):
//        1	 2	3	4	5
//        2	 3	4	5	1
//        3	 4	5	1	2
//        4	 5	1	2	3
//        5	 1	2	3	4
//        Użyj dwóch różnych (oddzielnych) pętli do	tworzenia tablicy i drukowania wyników.

import java.util.Scanner;

public class weekend3homework14 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna z zakresu 1 - 10 :");
        int userNumber = scr.nextInt();

        int array[][] = new int[userNumber][userNumber];
        for (int i = 0; i <userNumber ; i++) {
            System.out.println();
            for (int j = 0; j <userNumber ; j++) {
                array[i][j] =((i + j)% userNumber) + 1;
                System.out.printf("%d ",array[i][j]);

            }
        }
    }

}
