package Zadanie4;

import Zadanie4.Adds.Frytki;
import Zadanie4.Adds.surowki;
import Zadanie4.Base.RybaDnia;
import Zadanie4.Base.Schabowy;

public class demo {
    public static void main(String[] args) {

        Obiad miesny = new Frytki(new Schabowy());
        System.out.print(miesny.pobierzOpis());
        System.out.println(" :: Koszt: " + miesny.koszt() + " zl");

        Obiad rybny = new surowki(new RybaDnia());
        System.out.print(rybny.pobierzOpis());
        System.out.println(" :: Koszt: " + rybny.koszt() + " zl");
    }
}
