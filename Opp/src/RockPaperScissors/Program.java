package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int gameCounter = 0;

        while (true) {
            gameCounter++;
            System.out.println("Rock Paper Scissors Game" +
                    "\n0: Leave the game" +
                    "\n1: Rock" +
                    "\n2: Paper" +
                    "\n3: Scissors");
            int user = scr.nextInt();
            Random rnd = new Random();
            int compRnd = rnd.nextInt(3);
            RPS compChose = RPS.PAPER;
            RPS userChose = RPS.PAPER;

            switch (compRnd) {
                case 1:
                    compChose = RPS.ROCK;
                    break;
                case 2:
                    compChose = RPS.PAPER;
                    break;
                case 3:
                    compChose = RPS.SCISSORS;
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Error");
            }

            switch (user) {
                case 1:
                    userChose = RPS.ROCK;
                    break;
                case 2:
                    userChose = RPS.PAPER;
                    break;
                case 3:
                    userChose = RPS.SCISSORS;
                    break;
                default:
                    System.out.println("Error");
            }

            System.out.println("This is your : " + gameCounter + " game");
        }
    }


    public static void compare() {

    }

}

