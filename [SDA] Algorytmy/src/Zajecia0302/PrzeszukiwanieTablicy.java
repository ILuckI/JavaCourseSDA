package Zajecia0302;

import java.util.Scanner;

public class PrzeszukiwanieTablicy {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number and string of characters");
        System.out.println("Example: 4 [1,4,78,3]");
        String userDate = scr.nextLine();

        int numer = Integer.parseInt(userDate.substring(0, userDate.indexOf("[")).trim());
        String values = userDate.substring(userDate.indexOf("[") + 1, userDate.indexOf("]")).trim();
        String[] val = values.split(",");
        int[] valuesInt = new int[val.length];

        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        int index = -1;
        for (int i = 0; i < valuesInt.length; i++) {
            if (valuesInt[i] == numer) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
