import java.util.Scanner;

public class printf_nauka {
    public static void main(String[] args) {
//
//        int wiek = 4;
//        double wzrost = 1.80;
//        System.out.printf("Lukasz ma : %d lata i ma %3.2f wzrostu!", wiek, wzrost);  // %d w to miejsce wkleja sie zmienna
//
//        System.out.printf("1 -.- PI: %8.3f\n",Math.PI);
//        System.out.printf("2 <.> PI: %2.3f\n",Math.PI);
//        System.out.printf("3 ^.^ PI: %08.3f\n",Math.PI);
        System.out.printf("Zadanie 1 : %.5f\n", Math.PI);
        System.out.printf("Zadanie 2 : %.2f\n", Math.pow(Math.PI, 2.0));
        System.out.print("Zadanie 3: Podaj promien : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("Objetosc jednej z twojej kuli to : %.2f\n", obliczKule(r));
        System.out.println("Koniec ^.-");


    }

    public static double obliczKule(double x) {
        return 4 / 3 * Math.PI * (Math.pow(x, 3.0));
    }
}
