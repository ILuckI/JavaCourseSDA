package WzorzecObserwator.StacjaPogodowa.Wyswietlacze;

import WzorzecObserwator.StacjaPogodowa.Obserwator;
import WzorzecObserwator.StacjaPogodowa.Podmiot;
import WzorzecObserwator.StacjaPogodowa.WyswietlElement;

public class WarunkiBiezace implements Obserwator, WyswietlElement {
    private Podmiot danePogodowe;
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public WarunkiBiezace(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.dodajNaListeSubskrybentow(this);    // this - przekazujemy obecna klase (siebie)
    }


    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
    }

    @Override
    public void wyswietlElement() {
        System.out.printf("Temp: %.2f :: Cisnienie %.2f :: Wilgotnosc %.2f \n",temp, cisnienie, wilgotnosc);
    }
}
