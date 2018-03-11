package WzorzecFasada.KinoDomowe;

public class Ekran {
    boolean opuszczony;

    public void opusc() {
        opuszczony = true;
    }

    public void podnies() {
        opuszczony = false;
    }
}
