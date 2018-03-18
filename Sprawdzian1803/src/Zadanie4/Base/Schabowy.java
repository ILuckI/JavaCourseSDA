package Zadanie4.Base;

import Zadanie4.Obiad;

public class Schabowy extends Obiad {
    @Override
    public String pobierzOpis() {
        return "Kotlet Schabowy";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
