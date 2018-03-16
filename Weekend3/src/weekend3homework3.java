import java.util.Scanner;

public class weekend3homework3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj ilosc true/false: ");
        int userTrueFalse = scr.nextInt();
        boolean userBool[] = new boolean[userTrueFalse];
        int number[] = new int[userTrueFalse];

        int counter = 0;
        for (int i = 0; i < userTrueFalse; i++) {
            System.out.println("Podaj liczbe 1 po 2");
            userBool[i] = scr.nextBoolean();

        }

        for (int i = 0; i < userTrueFalse ; i++) {
           if (userBool[i] == true){
               number[i]++;
           }
           else {
               number[i] = number[i];
           }
           System.out.println(number[i]);
        }

    }


}