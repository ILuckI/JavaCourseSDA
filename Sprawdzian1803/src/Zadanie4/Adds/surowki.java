package Zadanie4.Adds;

import Zadanie4.Obiad;

public class surowki extends Dodatki {
    Obiad obiad;

    public surowki(Obiad obiad){
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " plus surowki";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 1.00;
    }
}
