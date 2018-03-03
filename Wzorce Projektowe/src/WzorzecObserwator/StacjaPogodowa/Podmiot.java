package WzorzecObserwator.StacjaPogodowa;

public interface Podmiot {
    void dodajNaListeSubskrybentow(Obserwator obserwator);
    void usunZListySubskrybentow(Obserwator obserwator);
    void przekazAktualizacje();
}
