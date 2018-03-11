package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class MocnoPalona extends Napoj {
    @Override
    public String pobierzOpis() {
        return "Kawa mocno palona";
    }

    @Override
    public double koszt() {
        return 11.00;
    }
}
