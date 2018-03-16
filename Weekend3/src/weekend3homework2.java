import java.util.Scanner;

public class weekend3homework2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int userNumber = scr.nextInt();
        boolean array2[] = new boolean[100];
        int counter = 0;

        int i = 0;
        while (userNumber > 0) {
            array2[i] =(userNumber % 2 == 0) ? true : false;
            userNumber = Math.floorDiv(userNumber, 2);
            counter++;
            i++;
        }

        for (int j = counter - 1; j >= 0; j--) {
            System.out.print(" "+ array2[j]);
        }
        System.out.println("\n" + counter);
    }


}