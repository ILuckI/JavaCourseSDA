import java.util.Scanner;

public class ReviewWeekend2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // zadanie 1
        System.out.println("Podaj 1 liczbe: ");
        int number1 = Math.abs(scr.nextInt());
        System.out.println("Podaj 2 liczbe: ");
        int number2 = Math.abs(scr.nextInt());
        if (number1 > number2)
            System.out.printf("Liczba %d ma większą wartosc", number1);
        else
            System.out.printf("Liczba %d ma większą wartosc", number2);

        // zadanie 2
        System.out.println("\nPodaj mniejsza liczbe ");
        int numberm = scr.nextInt();
        System.out.println("Podaj wieksza liczbe ");
        int numbern = scr.nextInt();
        int suma = 1;
        if (numberm < numbern) {
            for (int i = numberm; i <= numbern; i++) {
                suma *= i;
            }
            System.out.println(suma);
        } else
            System.out.println("Podales blednie liczby. 1 liczba musi byc mniejsza od 2");

        // zadanie 3

        int n = scr.nextInt();
        System.out.printf("Silnia od %d = %d", n, factorial(n));

        // Zzadanie 4

        System.out.println("Podaj liczbe");
        int n2 = scr.nextInt();
        System.out.println(power(n2));

    }

    public static int power(int n) {
        double power = Math.pow(2.0, n);
        return (int) power;
    }

    public static int factorial(int n) {

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

