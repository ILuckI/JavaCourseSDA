package WzorzecObserwator.StacjaPogodowa;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot{
    private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public void odczytyZmiana(){
     przekazAktualizacje();
    }

    public void ustawOdczyty(float temp, float wilgotnosc, float cisnienie){    // fejkowa metoda ustawiajaca odczyty
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    @Override
    public void dodajNaListeSubskrybentow(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunZListySubskrybentow(Obserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void przekazAktualizacje() {
        for (Obserwator obserwator : obserwatorzy) {
            obserwator.aktualizacja(temp, wilgotnosc, cisnienie);
        }

    }


}
