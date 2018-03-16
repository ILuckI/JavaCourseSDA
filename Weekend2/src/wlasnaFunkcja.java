import java.util.Scanner;

public class wlasnaFunkcja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int wynikDodawania = dodawanie(a, b);   // ze mnienna
        System.out.println("Dodawanie a i b = " +wynikDodawania);     // drukuje zmienna funkcji

        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Dodawania c i d = " +dodawanie2(c,d));    // w jednej linijce bez zmiennej
        System.out.println("Kwadratowanie dodawania a i b = " + kwadratowanie(dodawanie(a,b))); // dwie funkcje (funkcja w funkcji)
        System.out.println("Podaj imie : ");

    }

    public static int dodawanie(int x, int y){
        int wynik = x + y;
        return wynik;
    }
    public static double dodawanie2(double x, double y){
        double wynik = x + y;
        return wynik;
    }
    public static double kwadratowanie(int x){
        return x * x;
    }

}
