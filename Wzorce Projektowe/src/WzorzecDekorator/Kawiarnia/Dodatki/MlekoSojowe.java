package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class MlekoSojowe extends SkladnikiDekorator {

    Napoj napoj;

    public MlekoSojowe(Napoj napoj){
        this.napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z mlekiem sojowym";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.80;
    }
}
