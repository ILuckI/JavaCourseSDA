package Zbior;

import java.util.Scanner;

public class SpacjeCamelCase {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        char[] userString = src.nextLine().toLowerCase().toCharArray();
        userString[0] = Character.toUpperCase(userString[0]);

        for (int i = 0; i < userString.length; i++) {
            if (userString[i] == ' ') {
                userString[i + 1] = Character.toUpperCase(userString[i + 1]);
            }
        }

        for (int i = 0; i < userString.length; i++) {
            if (userString[i] != ' ')
                System.out.print(userString[i]);
        }
    }
}