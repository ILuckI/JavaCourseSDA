package Zajecia1003.Kolekcje;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        TreeSet<String> zbior=new TreeSet<>();
        zbior.add("Nowak");
        zbior.add("Kowalski");
        zbior.add("Wiśniewski");
        zbior.add("Wójcik");
        zbior.add("Kowalczyk");
        for (String s :zbior) {
            System.out.println(s);
        }
        TreeSet<String> zbior2=new TreeSet<>();
        zbior2.add("Kowalski");
        zbior2.add("Wiśniewski");

        TreeSet<String> ZbiorKopia=new TreeSet(zbior);
        ZbiorKopia.retainAll(zbior2);

        for (String s :ZbiorKopia) {
            System.out.println(s);
        }
//3
        TreeSet<Integer>zbiorInt=new TreeSet<>();
        zbiorInt.add(1);
        zbiorInt.add(2);
        zbiorInt.add(3);
        zbiorInt.add(5);

        if (zbiorInt.contains(new Integer(4))){
            System.out.println(4);
        }else {
            SortedSet<Integer> podrzewo = zbiorInt.tailSet(new Integer(4));
            System.out.println(podrzewo.first());
        }
    }
}
