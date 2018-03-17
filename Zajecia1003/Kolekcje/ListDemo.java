package Zajecia1003.Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        int[] tab1=new int[10];
        for (int i = 0; i <tab1.length ; i++) {
            tab1[i]=i;
        }
        Integer[] tab2=new Integer[10];
        for (int i = 0; i <tab2.length ; i++) {
            tab2[i]=i;
        }
        List arrayList1= Arrays.asList(tab1);
        List arrayList2=Arrays.asList(tab2);

        System.out.println();
    //zad2
        ArrayList copy = new ArrayList(arrayList2);
    //zad3
        Collections.reverse(copy);
    //zad4
        arrayList2.addAll(copy);

    }
}
