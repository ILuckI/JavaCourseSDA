package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Czekolada extends SkladnikiDekorator {

    Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return 0.50 + napoj.koszt();
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + "z czekolada";
    }
}
