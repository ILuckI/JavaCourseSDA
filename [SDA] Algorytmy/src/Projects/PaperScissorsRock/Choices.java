package Projects.PaperScissorsRock;

public enum Choices {
    ROCK(0, "k"),
    SCISSORS(1, "n"),
    PAPER(2, "p");

    private int values;
    private String firstLetter;

    Choices(int values, String firstLetter) {
        this.values = values;
        this.firstLetter = firstLetter;
    }

    public int getValues() {
        return values;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public static Choices getEnumBasedOnInt(int e) {
        for (Choices choices : Choices.values()) {
            if (choices.getValues() == e)
                return choices;
        }
        return ROCK;
    }

    public static Choices getEnumBasedOnString(String e) {
        for (Choices choices : Choices.values()) {
            if (choices.getFirstLetter().equals(e))
                return choices;
        }
        return ROCK;
    }

}