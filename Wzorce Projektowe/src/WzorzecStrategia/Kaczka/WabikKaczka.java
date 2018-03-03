package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.NieKwacze;
import WzorzecStrategia.SposobyLatania.NieLatam;

public class WabikKaczka extends Kaczka {
    public WabikKaczka() {
        kwakanieInterface = new NieKwacze();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem Kaczka Wabik");
    }


}
