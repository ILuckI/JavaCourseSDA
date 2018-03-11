package WzorzecFasada.Garderoba.wiosna;

import WzorzecFasada.Garderoba.Cloth;

public class BluzaZKapturem implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" bluze z kapturem");
    }
}
