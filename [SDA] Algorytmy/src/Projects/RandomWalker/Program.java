package Projects.RandomWalker;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose the size of the game board [10-100]: ");
        int range = scr.nextInt();

        RandomWalkerCore game = new RandomWalkerCore(range, range);
        game.letsPlay(range,range);
        System.out.println(game);
    }
}
