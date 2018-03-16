package Zajecia0302;

import java.util.Scanner;

public class WyszukiwanieLidera {
    public static void main(String[] args) {
        // User date
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter numbers ");
        System.out.println("Example: [1,1,1,4,78,3]");
        String userDate = scr.nextLine();

        // Substring of [+1 ...... to ]
        String values = userDate.substring(userDate.indexOf("[") + 1, userDate.indexOf("]")).trim();
        String[] val = values.split(",");
        int[] valuesInt = new int[val.length];

        // string.tab to int.tab
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }
        // max
        int max = valuesInt[0];
        for (int i = 0; i < valuesInt.length; i++) {
            if (max < valuesInt[i])
                max = valuesInt[i];
        }

        // build countTab
        int[] countTab = new int[valuesInt.length];
        int[] tabOfNumbers = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < valuesInt.length; i++) {
            for (int j = 0; j <tabOfNumbers.length ; j++) {
                if (valuesInt[i] == tabOfNumbers[j]){
                    countTab[j]++;
                }
            }
        }
        // find a max
        int maxCount = countTab[0];
        for (int i = 0; i < countTab.length; i++) {
            if (maxCount < countTab[i])
                maxCount = countTab[i];
        }
        // find a leader
        int leader = -1;
        for (int i = 0; i <countTab.length ; i++) {
            if (maxCount == countTab[i])
                leader = i;
                }

        // print
        if (maxCount >= countTab.length / 2)
            System.out.println("Leader number = " + leader + "\nNumber of repetitions = " + maxCount);
        else
            System.out.println("-1");
    }
}

