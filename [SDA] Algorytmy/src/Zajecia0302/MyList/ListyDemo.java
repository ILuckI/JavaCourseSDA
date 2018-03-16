package Zajecia0302.MyList;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();                 // tworzymy liste
        cars.add("Mercedes");                                       // dodajemy dane
        cars.add("Audi");
        cars.add("Skoda");

        cars.remove(0);                                     // kasowanie po indexie

        for (int i = 0; i < cars.size(); i++) {                    // wyswietlanie listy
            System.out.println(cars.get(i));
        }
        System.out.println("----------------------------------------");
        cars.add("Ford");
        cars.add("Porche");
        for (String car : cars) {                                   // odczytuje liste cars do car i wypisuje car
            System.out.println(car);                                // for ich tylko wyswietla dane !
        }


    }
}
