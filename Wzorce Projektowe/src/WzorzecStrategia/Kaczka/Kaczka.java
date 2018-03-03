package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.KwakanieInterface;
import WzorzecStrategia.SposobyLatania.LatanieInterface;

public abstract class Kaczka {
    protected LatanieInterface latanieInterface;
    protected KwakanieInterface kwakanieInterface;

    public void wykonajkwacz() {
        kwakanieInterface.kwacz();
    }

    public void plywaj() {
        System.out.println("Plywu plywu");
    }

    public void wyswietl() {
        System.out.println("Wyswietlam Kaczke");

    }

    public void wykonajlec() {
        latanieInterface.lec();
    }

    public void setLatanieInterface(LatanieInterface latanieInterface) {
        this.latanieInterface = latanieInterface;
    }

    public void setKwakanieInterface(KwakanieInterface kwakanieInterface) {
        this.kwakanieInterface = kwakanieInterface;
    }
}
