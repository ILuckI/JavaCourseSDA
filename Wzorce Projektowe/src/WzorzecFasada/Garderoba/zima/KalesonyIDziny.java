package WzorzecFasada.Garderoba.zima;

import WzorzecFasada.Garderoba.Cloth;

public class KalesonyIDziny implements Cloth {
    boolean dress;

    @Override
    public void dress() {
        dress = true;
    }

    @Override
    public void getName() {
        System.out.println(" kalesony i dziny");
    }
}
