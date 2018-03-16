package Zajecia0302.MyDeck;

public class Card {
    Color color;
    Figures figure;

    public Card(Color color, Figures figure){
        this.color = color;
        this.figure = figure;
    }

    public Color getColor() {
        return color;
    }

    public Figures getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return color.name() + " " + figure.name();
    }
}
