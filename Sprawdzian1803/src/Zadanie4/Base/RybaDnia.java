package Zadanie4.Base;

import Zadanie4.Obiad;

public class RybaDnia extends Obiad {
    @Override
    public String pobierzOpis() {
        return "Ryba Dnia: Dorsz";
    }

    @Override
    public double koszt() {
        return 8.00;
    }
}
