package WzorzecFasada.Garderoba.wiosna;

import WzorzecFasada.Garderoba.Cloth;

public class SpodnieDresowe implements Cloth{
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" spodnie dresowe");
    }
}
