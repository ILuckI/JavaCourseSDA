package WzorzecFasada.KinoDomowe;

public class Fasada {
    Ekran ekran;
    Projektor projektor;
    Wzmacniacz wzmacniacz;

    public Fasada(Ekran ekran, Projektor projektor, Wzmacniacz wzmacniacz) {
        this.ekran = ekran;
        this.projektor = projektor;
        this.wzmacniacz = wzmacniacz;
    }

    public void rozpocznijSeans() {
        ekran.opusc();
        projektor.wlacz();
        projektor.ustawZrodlo("DVD");
        wzmacniacz.wlacz();
        wzmacniacz.ustawZrodlo("DVD");
        wzmacniacz.ustawGlosnosc(50);
    }

    public void zakonczSeans() {
        ekran.podnies();
        projektor.wylacz();
        wzmacniacz.wylacz();

    }

}
