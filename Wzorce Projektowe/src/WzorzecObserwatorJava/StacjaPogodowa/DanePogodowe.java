package WzorzecObserwatorJava.StacjaPogodowa;

import java.util.Observable;
import java.util.Observer;

public class DanePogodowe extends Observable {

    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public void odczytyZmiana() {
        setChanged();
        notifyObservers();
    }

    public void ustawOdczyty(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    public float getTemp() {
        return temp;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}
