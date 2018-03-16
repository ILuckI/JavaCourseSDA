package Projects.GameOfHundred;

import java.util.Random;
import java.util.Scanner;

public class Game {
    protected int compNumber;
    protected int userNumber;
    protected int currentNumber = 100;
    protected int gameNumber = 0;

    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);

    public void letsPlay() {
        while (currentNumber > 1) {
            gameNumber++;
            System.out.printf("Current Number: %d\n", currentNumber);
            if (currentNumber >= 1 && currentNumber <= 100) {
                System.out.println("Enter number [1 - 10]");
                try {
                    userNumber = scr.nextInt();
                } catch (Exception ex) {
                    scr.next();
                    continue;
                }
                if (userNumber >= 1 && userNumber <= 10) {
                    if (currentNumber <= 10 && currentNumber == userNumber) {
                        System.out.printf("\nCongratulation! You win this game!");
                        return;
                    } else
                        currentNumber -= userNumber;
                }

                compNumber = rnd.nextInt(10);
                if (compNumber != 0) {
                    if (currentNumber <= 10) {
                        compNumber = currentNumber;
                        currentNumber -= compNumber;
                        System.out.printf("Computer number is %d\nComputer win this game! Try again!", compNumber);
                        return;
                    }
                    currentNumber -= compNumber;
                    System.out.printf("Computer number is %d\n", compNumber);

                }
            } else if (compNumber == 0) {
                compNumber = rnd.nextInt(10);
                currentNumber -= compNumber;
                System.out.printf("Computer number is %d\n", compNumber);
            }
        }
    }
}




// enum z player i komp liczyc kogo ruch 0 / 1 / 0 / 1
