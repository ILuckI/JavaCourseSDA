package WzorzecObserwator.StacjaPogodowa;

public interface Obserwator {
    void aktualizacja(float temp, float wilgotnosc, float cisnienie);
}
