package Zajecia2701;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("How many numbers:");
        int howMany = scr.nextInt();
        int sum = 0;

        for (int i = 0; i < howMany; i++) {
            System.out.println("Set number");
            try {
                sum += Integer.parseInt(scr.next());
            } catch (NumberFormatException e) {
                System.out.println("Exception");
                scr.next();
                continue;
            }
        }
        System.out.println(sum);
    }
}
