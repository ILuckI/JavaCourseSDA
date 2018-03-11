package WzorzecFasada.KinoDomowe;

public class Projektor {
    boolean wlacz;
    String zrodlo;
    public void wlacz(){
        wlacz = true;
    }
    public void wylacz(){
        wlacz = false;
    }
    public void ustawZrodlo(String zrodlo){
        this.zrodlo = zrodlo;
    }
}
