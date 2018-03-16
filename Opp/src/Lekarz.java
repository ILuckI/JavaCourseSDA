public class Lekarz extends Pracownik {
private int premia;

    public Lekarz(String imie, String nazwisko, double wyplata, int premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public int getPremia() {
        return premia;
    }
}
