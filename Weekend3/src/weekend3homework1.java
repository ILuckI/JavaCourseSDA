import java.util.Scanner;

public class weekend3homework1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int userNumber = scr.nextInt();
        int array[] = new int[100];
        int counter = 0;

        int i = 0;
        while (userNumber > 0) {
            array[i] = (userNumber % 2);
            userNumber = Math.floorDiv(userNumber, 2);
            counter++;
            i++;
        }

        for (int j = counter - 1; j >= 0; j--) {
            System.out.printf("%d", array[j]);
        }

    }


}
