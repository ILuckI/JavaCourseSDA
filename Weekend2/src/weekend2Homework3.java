import java.util.Scanner;

public class weekend2Homework3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double userNumbers[] = new double[10];

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("Podaj liczbe rzeczywista: ");
            double userChoice = scr.nextDouble();
            userNumbers[i] = userChoice;

        }
        System.out.println("Podane liczby wyswietlane od konca:");
        for (int i = userNumbers.length-1; i > 0; i--) {
            System.out.printf("%.2f\t",userNumbers[i]);

        }
        System.out.println("\nPodane liczby wyswietlane od konca podniesione do kwadratu :");
        for (int i = userNumbers.length-1; i > 0 ; i--) {
            userNumbers[i] = userNumbers[i] * userNumbers[i];
            System.out.printf("%.2f\t",userNumbers[i]);
        }

    }
}
