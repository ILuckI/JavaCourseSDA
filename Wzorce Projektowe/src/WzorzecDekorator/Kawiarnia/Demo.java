package WzorzecDekorator.Kawiarnia;

import WzorzecDekorator.Kawiarnia.Dodatki.Mleko;
import WzorzecDekorator.Kawiarnia.SkladnikiBazowe.Bezkofeinowa;

public class Demo {
    public static void main(String[] args) {

        Napoj bezkofeinowaZMlekiem = new Mleko(new Bezkofeinowa());

        System.out.println(bezkofeinowaZMlekiem.pobierzOpis());
        System.out.println(bezkofeinowaZMlekiem.koszt());
    }
}
