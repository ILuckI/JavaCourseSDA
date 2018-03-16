package Projects.Miner;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose the width of the game board [3-10]: ");
        int xRange = scr.nextInt();
        System.out.println("Choose the height of the game board [3-10]: ");
        int yRange = scr.nextInt();
        System.out.println("Choose the probability of mines [25 - 75]: ");
        int probability = scr.nextInt();

        SaperGameCore game = new SaperGameCore(xRange, yRange, probability);

        int gameBoard[][] = game.giveMeMap();

        String lineToPrint = new String();
        for (int i = 1; i < xRange; i++) {

            lineToPrint = "| ";
            for (int j = 1; j < yRange; j++) {
                lineToPrint += (gameBoard[i][j] > 99 ? "X" : gameBoard[i][j]) + ", ";
            }
            lineToPrint += "|";
            System.out.println(lineToPrint);
        }
    }
}






