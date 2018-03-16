package Interfaces;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Dwukolowy motocykl = new Motocykl();
        Motocykl motocykl1 = new Motocykl();
        Dwukolowy rower = new Rower();
        Rower rower1 = new Rower();

       ZaparkujPojazdDwukolowy(rower);
       ZaparkujPojazdDwukolowy(rower1);
       ZaparkujPojazdDwukolowy(motocykl);
       ZaparkujPojazdDwukolowy(motocykl1);


       ZaparkujPojazdMotocykl(motocykl1);


    }

    public static void ZaparkujPojazdDwukolowy(Dwukolowy pojazd) {
        pojazd.zaparkuj();
    // odnosi sie do interface Dwukolowy (mozna zaparkowac wszystkie klasy kozystajace z tego interfacu)

    }


    public static void ZaparkujPojazdMotocykl(Motocykl pojazd) {
        pojazd.zaparkuj();
        // odnosi sie do klasy Motocykl (mozna zaparkowac tylko obiekty klasy motocykl)

    }
}
