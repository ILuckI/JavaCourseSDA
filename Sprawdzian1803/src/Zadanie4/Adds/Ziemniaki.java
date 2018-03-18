package Zadanie4.Adds;

import Zadanie4.Obiad;

public class Ziemniaki extends Dodatki {
    Obiad obiad;

    public Ziemniaki(Obiad obiad){
        this.obiad = obiad;
    }

    @Override
    public String pobierzOpis() {
        return obiad.pobierzOpis() + " plus ziemniaki";
    }

    @Override
    public double koszt() {
        return obiad.koszt() + 1.00;
    }
}
