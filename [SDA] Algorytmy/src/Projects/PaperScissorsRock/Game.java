package Projects.PaperScissorsRock;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Projects.PaperScissorsRock.Choices computerChoices;
    private Projects.PaperScissorsRock.Choices userChoices;

    private int gamesNumber = 0;
    private int gamerWins = 0;
    private int computerWins = 0;

    public void startGame() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("n - nożyczki, p - papier, " +
                    "k - kamień, q - wyjście");
            String userInput = sc.next();
            userInput = userInput.toLowerCase().trim();
            if (userInput.equals("q")) {
                break;
            }

            int computerInput = rand.nextInt(3);
            computerChoices = Projects.PaperScissorsRock.Choices.getEnumBasedOnInt(computerInput);

            if (userInput.equals("k") || userInput.equals("n")
                    || userInput.equals("p")) {
                userChoices = Projects.PaperScissorsRock.Choices.getEnumBasedOnString(userInput);
            } else {
                System.out.println("Błędny wybór");
                continue;
            }
            gamesNumber++;
            calculateResult();
        }

        System.out.println("Wygrałeś: " + gamerWins +
                " razy. Przegrałeś: " + computerWins +
                " Zagrałeś " + gamesNumber + " gier.");

    }

    private void calculateResult() {
        if (userChoices.equals(computerChoices)) {
            System.out.println("Remis, obaj wybraliście: "
                    + userChoices.getFirstLetter());
        } else if (userChoices.equals(Choices.ROCK) &&
                computerChoices.equals(Choices.SCISSORS)) {
            gamerWins++;
            System.out.println("Gratulacje wygrałeś!"
                    + " Wskazałeś kamień, a komputer nożyczki");
        } else if (userChoices.equals(Choices.ROCK) &&
                computerChoices.equals(Choices.PAPER)) {
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś kamień, a komputer papier");
        } else if (userChoices.equals(Choices.SCISSORS) &&
                computerChoices.equals(Choices.ROCK)) {
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś nożyczki, a komputer kamień");
        } else if (userChoices.equals(Choices.SCISSORS) &&
                computerChoices.equals(Choices.PAPER)) {
            gamerWins++;
            System.out.println("Wygrałeś!"
                    + " Wskazałeś nożyczki, a komputer papier");
        } else if (userChoices.equals(Choices.PAPER) &&
                computerChoices.equals(Choices.ROCK)) {
            gamerWins++;
            System.out.println("Wygrałeś!"
                    + " Wskazałeś papier, a komputer kamień");
        } else if (userChoices.equals(Choices.PAPER) &&
                computerChoices.equals(Choices.SCISSORS)) {
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś papier, a komputer nożyczki");
        }
    }
}