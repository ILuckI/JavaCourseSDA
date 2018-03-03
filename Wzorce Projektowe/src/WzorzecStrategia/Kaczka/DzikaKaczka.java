package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.Kwacze;
import WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieInterface = new Kwacze();
        latanieInterface = new LatamBoMamSkrzydla();
    }
    @Override
    public void wyswietl() {
        System.out.println("Jestem Kaczka Dziwaczka!");
    }


}
