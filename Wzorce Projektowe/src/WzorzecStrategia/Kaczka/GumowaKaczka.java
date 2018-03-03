package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.Piszcz;
import WzorzecStrategia.SposobyLatania.NieLatam;

public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        kwakanieInterface = new Piszcz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyswietlam Gumowa Kaczke");
    }
}
