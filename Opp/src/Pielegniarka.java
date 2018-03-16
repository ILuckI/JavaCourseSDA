public class Pielegniarka extends Pracownik {
    private int nadgodziny;

    public Pielegniarka(String imie, String nazwisko, double wyplata, int nadgodziny) {
        super(imie, nazwisko, wyplata);
        this.nadgodziny = nadgodziny;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }
}
