package RockPaperScissors;

import java.util.Random;

public class ComputerMove {
    Random rnd = new Random();
    int chose = rnd.nextInt(3);

    public ComputerMove() {

    }

    public static String comp(int chose) {
        String comp = new String();
        if (chose == 1)
            comp = "ROCK";
        if (chose == 2)
            comp = "PAPER";
        if (chose == 3)
            comp = "SCISSORS";
        return comp;
    }

    public Random getRnd() {
        return rnd;
    }

}
