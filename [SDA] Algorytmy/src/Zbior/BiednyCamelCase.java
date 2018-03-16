package Zbior;

import java.util.Scanner;

public class BiednyCamelCase {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        char[] userString = src.nextLine().replace(" ", "").toLowerCase().toCharArray();

        for (int i = 0; i < userString.length; i += 2) {
            userString[i] = Character.toUpperCase(userString[i]);
        }
        for (int i = 0; i <userString.length ; i++) {
            System.out.print(userString[i]);
        }
    }
}
