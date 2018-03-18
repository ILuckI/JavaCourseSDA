package Zadanie4.Adds;

import Zadanie4.Obiad;

public class Frytki extends Dodatki {
    Obiad obiad;

    public Frytki(Obiad obiad){
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " plus frytki";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 1.00;
    }
}
