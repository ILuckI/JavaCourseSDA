import java.util.Scanner;

public class obliczanieSpalania {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        while (true) {
            System.out.println("\n Menu : \n1:Oblicz spalanie twojej fury \n2:Oblicz jak daleko zajedziesz \n0:Zakoacz program" );
            int menu = sc.nextInt();
            switch (menu)

            double iloscKasy = 200.0;
            double iloscPaliwa = iloscKasy / 4.57;
            double iloscKilometrow = 315.0;
            double wynik = (iloscPaliwa / iloscKilometrow) * 100;

            if (wynik <= 6.5 && wynik >= 5) {
                System.out.print("Twoje auto srednio spala : ");
                System.out.printf("%3.1f", wynik);
                System.out.print(" litrow na 100 km\nJest to ekonomiczny samochod");
            } else if (wynik <= 4.9) {
                System.out.print("Twoje auto srednio spala : ");
                System.out.printf("%3.1f", wynik);
                System.out.print(" litrow na 100 km\nJest to bardzo ekonomiczny samochod");
            } else if (wynik >= 6.6 && wynik <= 8) {
                System.out.print("Twoje auto srednio spala : ");
                System.out.printf("%3.1f", wynik);
                System.out.print(" litrow na 100 km\nJest to przecietny ekonomicznie samochod");
            } else {
                System.out.print("Twoje auto srednio spala : ");
                System.out.printf("%3.1f", wynik);
                System.out.print(" litrow na 100 km\nNie jest to raczej ekonomiczny samochod");
            }
        }
    }
}
