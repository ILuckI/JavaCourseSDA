package WzorzecFasada.Garderoba.zima;

import WzorzecFasada.Garderoba.Cloth;

public class BluzaIKurtka implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" bluze i ciepla kurtke");
    }
}
