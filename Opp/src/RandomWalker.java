import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose the size of the game board [10-100]: ");
        int range = scr.nextInt();

        RandomWalkerCore game = new RandomWalkerCore(range,range);
        System.out.println(game);
    }
}
