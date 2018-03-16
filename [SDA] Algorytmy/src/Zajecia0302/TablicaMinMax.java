package Zajecia0302;

import java.util.Scanner;

public class TablicaMinMax {
    public static void main(String[] args) {

        // User date
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter numbers ");
        System.out.println("Example: [1,4,78,3]");
        String userDate = scr.nextLine();

        // Substring of [+1 ...... to ]
        String values = userDate.substring(userDate.indexOf("[") + 1, userDate.indexOf("]")).trim();
        String[] val = values.split(",");
        int[] valuesInt = new int[val.length];

        // string.tab to int.tab
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }

        // max & min
        int max = valuesInt[0];
        int min = valuesInt[0];
        int indexMax = -1;
        int indexMin = -1;

        for (int i = 0; i < valuesInt.length; i++) {
            if (max < valuesInt[i])
                max = valuesInt[i];
                indexMax = i;
            if (min > valuesInt[i])
                min = valuesInt[i];
                indexMin = i;
        }
        System.out.println("MinValue = " + min + " index = " + indexMax + "\nMaxValue = " + max + " index = " + indexMin);
    }
}
