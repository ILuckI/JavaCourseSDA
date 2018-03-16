import java.util.Random;
import java.util.Scanner;

public class randomNauka {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int liczba = rand.nextInt(11);
        int gameCounter = 0;

        while (true) {
            gameCounter++;

            System.out.println("Podaj liczbe :");
            int x = sc.nextInt();

            if (x < liczba)
                System.out.println("Liczba za mala");

            else if (x > liczba)
                System.out.println("Liczba za duza");


            else if (x == liczba){
                System.out.println("GRATULUJE !!! Ilosc prob wynosi: " + gameCounter);
                return;}


        }
    }
}