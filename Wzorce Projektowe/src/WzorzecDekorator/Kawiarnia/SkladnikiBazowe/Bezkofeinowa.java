package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Bezkofeinowa extends Napoj {
    @Override
    public String pobierzOpis() {
        return "Kawa bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 9.00;
    }
}
