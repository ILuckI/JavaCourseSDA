package Zajecia1003.Kolekcje;

import java.util.ArrayDeque;

public class KolejkaDemo {
    public static void main(String[] args) {
        ArrayDeque<String>kolejka = new ArrayDeque<>();
        kolejka.add("Anna");
        kolejka.add("Józek");
        kolejka.add("Ela");

        for (int i = 0; i <3 ; i++) {
            System.out.println(kolejka.remove());
        }
//        for (String s :kolejka) {
//            System.out.println(kolejka.remove());
//        }

    }
}
