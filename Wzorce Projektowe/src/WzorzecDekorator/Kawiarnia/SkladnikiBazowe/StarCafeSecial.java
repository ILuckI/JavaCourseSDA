package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class StarCafeSecial extends Napoj {

    @Override
    public String pobierzOpis() {
        return "Star Cafe Special";
    }

    @Override
    public double koszt() {
        return 15.00;
    }
}
