package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.NieKwacze;
import WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class KaczkaModel extends Kaczka {

    public KaczkaModel(){
        kwakanieInterface = new NieKwacze();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem Kaczka Model");
    }
}
