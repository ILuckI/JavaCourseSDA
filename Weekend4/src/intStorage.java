public class intStorage {
    int liczba1;

    public intStorage(int liczba) {
        setLiczba1(liczba);
    }

    public intStorage() {
        liczba1 = -1;
    }

    public int setLiczba1(int liczba) {
        this.liczba1 = liczba;
        return liczba;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public String toString() {
        return ("Liczba = " + liczba1);
    }
}
