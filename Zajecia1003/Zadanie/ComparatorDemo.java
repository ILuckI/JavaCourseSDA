package Zajecia1003.Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter=5;
        ArrayList<String> wyrazy=new ArrayList<>();

        for (int i = 0; i <counter ; i++) {
            String dane=scanner.nextLine();
             wyrazy.add(dane);
        }
        Collections.sort(wyrazy, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (String s :wyrazy) {
            System.out.println(s);
        }

    }
}
