package WzorzecFasada.Garderoba.jesien;

import WzorzecFasada.Garderoba.Cloth;

public class SpodnieDziny implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" spodnie dziny");
    }
}
