package Zadanie4.Base;

import Zadanie4.Obiad;

public class Mielony extends Obiad {
    @Override
    public String pobierzOpis() {
        return "Kotlet Mielony";
    }

    @Override
    public double koszt() {
        return 4.00;
    }
}
