package WzorzecFasada.Garderoba;

import WzorzecFasada.Garderoba.jesien.ButyJesienne;
import WzorzecFasada.Garderoba.jesien.LekkaKurtka;
import WzorzecFasada.Garderoba.jesien.SpodnieDziny;
import WzorzecFasada.Garderoba.lato.Adidasy;
import WzorzecFasada.Garderoba.lato.Koszulka;
import WzorzecFasada.Garderoba.lato.KrotkieSpodenki;
import WzorzecFasada.Garderoba.wiosna.BluzaZKapturem;
import WzorzecFasada.Garderoba.wiosna.SpodnieDresowe;
import WzorzecFasada.Garderoba.wiosna.Trampki;
import WzorzecFasada.Garderoba.zima.BluzaIKurtka;
import WzorzecFasada.Garderoba.zima.CzapkaISzalik;
import WzorzecFasada.Garderoba.zima.KalesonyIDziny;

import java.util.Scanner;

public class Fasada {

    int poraRoku;

    public Fasada() {

        start();
        ifIs();

    }

    private void ifIs(){
        if (poraRoku == 1) {
            zima(new BluzaIKurtka(), new CzapkaISzalik(), new KalesonyIDziny());
            System.out.println("Jest zima, ubieram" );
        } else if (poraRoku == 2) {
            jesien(new ButyJesienne(), new LekkaKurtka(), new SpodnieDziny());
            System.out.println("Jest jesien, ubieram");
        } else if (poraRoku == 3) {
            lato(new Adidasy(), new Koszulka(), new KrotkieSpodenki());
            System.out.println("Jest lato, ubieram");
        } else if (poraRoku == 4) {
            wiosna(new BluzaZKapturem(), new SpodnieDresowe(), new Trampki());
            System.out.println("Jest wiosna, ubieram");
        }
    }

    private void zima(BluzaIKurtka bluzaIKurtka, CzapkaISzalik czapkaISzalik, KalesonyIDziny kalesonyIDziny) {
        bluzaIKurtka.dress();
        czapkaISzalik.dress();
        kalesonyIDziny.dress();
    }

    private void jesien(ButyJesienne butyJesienne, LekkaKurtka lekkaKurtka, SpodnieDziny spodnieDziny) {
        butyJesienne.dress();
        lekkaKurtka.dress();
        spodnieDziny.dress();
    }

    private void lato(Adidasy adidasy, Koszulka koszulka, KrotkieSpodenki krotkieSpodenki) {
        adidasy.dress();
        koszulka.dress();
        krotkieSpodenki.dress();
    }

    private void wiosna(BluzaZKapturem bluzaZKapturem, SpodnieDresowe spodnieDresowe, Trampki trampki) {
        bluzaZKapturem.dress();
        spodnieDresowe.dress();
        trampki.dress();
    }

    public void start() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj pore roku : \n1:Zima\n2:Jesien\n3:Lato\n4:Wiosna\n");
        poraRoku = scr.nextInt();
    }
}
