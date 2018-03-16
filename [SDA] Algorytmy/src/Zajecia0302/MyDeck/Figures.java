package Zajecia0302.MyDeck;

public enum Figures {
    ACE(0), TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5), SEVEN(6), EIGHT(7), NINE(8), TEN(9), JACK(10), QUEEN(1), KING(12);

    private int value;

    Figures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Figures getValueBasedInInt(int value) {
        for (Figures figure : Figures.values()) {           // Z ENUMA FIGURES WYCIAGAMY WSZYSTKIE VALUE Z ENUMA ()
            if (figure.getValue() == value)                 // JEZELI VALUE ENUMA JEST TAKIE SAMO JAK VALUE SZUKANE
                return figure;                              // ZWROC FIGURE WYSZUKANA
        }
        return ACE;
    }

}


