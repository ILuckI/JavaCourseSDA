package WzorzecFasada.Garderoba.jesien;

import WzorzecFasada.Garderoba.Cloth;

public class LekkaKurtka implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" lekka kurtka");
    }
}
