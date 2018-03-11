package WzorzecFasada.Garderoba.jesien;

import WzorzecFasada.Garderoba.Cloth;

public class ButyJesienne implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" buty jessienne");
    }
}
