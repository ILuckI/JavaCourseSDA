package WzorzecFasada.Garderoba.lato;

import WzorzecFasada.Garderoba.Cloth;

public class Adidasy implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" addidasy");
    }
}
