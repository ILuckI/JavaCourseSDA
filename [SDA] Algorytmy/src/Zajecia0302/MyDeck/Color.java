package Zajecia0302.MyDeck;

public enum Color {
    CLUBS(0), DIAMONDS(1), HEARTS(2), SPDES(3);

    private int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Color getValueBasedOnInt(int value) {
        for (Color color : Color.values()) {
            if (color.getValue() == value)
                return color;
        }
        return CLUBS;

    }
}
