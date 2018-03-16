import java.util.Scanner;

public class weekend2Homework2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.printf("Witaj! Ile liczb calkowitych deklarujesz ?\n");
        int howManyNumbers = scr.nextInt();
        int userNumbers[] = new int[howManyNumbers];
        int count = 0;
        if (howManyNumbers > 0) {
            for (int i = 0; i < howManyNumbers; i++) {
                count++;
                System.out.printf("Podaj liczbe %d : \n", count);
                int numbers = scr.nextInt();
                userNumbers[i] = numbers;
            }
        } else
            System.out.printf("Prosze podac dodatnia liczbe calkowita.");

        System.out.println("Twoje liczby to:");
        int numbersSum = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("%d\t", userNumbers[i]);
            numbersSum += userNumbers[i];
        }
        int numbersAverage = (numbersSum / howManyNumbers);
        System.out.printf("\nSuma twoich liczb to : %d\n", numbersSum);
        System.out.printf("Srednia z twoich liczb to : %d", numbersAverage);

    }
}
