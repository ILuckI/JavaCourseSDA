import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose the width of the game board [10-100]: ");
        int Range = scr.nextInt();

        RandomWalkerCore game = new RandomWalkerCore(Range, Range);

        Boolean gameBoard[][] = game.giveMeMap();

        for (int i = 1; i < Range; i++) {
            for (int j = 1; j < Range; j++) {

            }

        }
    }
}
