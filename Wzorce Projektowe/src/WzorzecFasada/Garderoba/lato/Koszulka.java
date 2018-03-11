package WzorzecFasada.Garderoba.lato;

import WzorzecFasada.Garderoba.Cloth;

public class Koszulka implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" koszulke");
    }
}
