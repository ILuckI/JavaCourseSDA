public class Pracownik {

    public String imie;
    public String nazwisko;
    public double wyplata;

    public Pracownik(String imie, String nazwisko, double wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

}
