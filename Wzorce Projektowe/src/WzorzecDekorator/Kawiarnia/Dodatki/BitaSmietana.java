package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class BitaSmietana extends SkladnikiDekorator {
    Napoj napoj;

    public BitaSmietana (Napoj napoj){
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z bita smietana";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 1.00;
    }
}
