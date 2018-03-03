package WzorzecStrategia.Kaczka;

import WzorzecStrategia.SposobyKwakania.Kwacze;
import WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {
public PlaskonosKaczka(){
    kwakanieInterface = new Kwacze();
    latanieInterface = new LatamBoMamSkrzydla();
}

    @Override
    public void wyswietl() {
        System.out.println("Jestem Kaczka Plaskonos");
    }
}
