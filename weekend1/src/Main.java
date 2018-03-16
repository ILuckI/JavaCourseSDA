public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Dzisiaj jest sobota! 25.11.2017r");
            int liczba = 0;
            int liczba1,liczba3;
            liczba1 = 5;
            liczba3 = 200000;
        System.out.println(liczba);
        System.out.println(liczba3);
            short wiek = 34;
            short aktualnyMiesiac = 11;
        System.out.println(wiek);
        System.out.println("Aktualny miesiac: " + aktualnyMiesiac + " , wiek: " + wiek);
        System.out.println("Lukasz\b\b"); // backspace
        System.out.println("Luk\tasz"); // spacja w tekscie
        System.out.println("Luk\nasz"); // nowa linia
        System.out.println("Luka\rsz"); // wyswietla wszystko do \r
        System.out.println("Luka\\sz"); // drukuje backslash

        short wiek1, wzrost = 123;
        wiek1 = 23;
        wzrost = 180;
        System.out.println(wzrost);

        int zmienna1 = 10;
        boolean zmienna2 = true;
        float zmienna3 = 1.254f;
        System.out.println("zmienna1:" + zmienna1 + " zmienna2:" + zmienna2 + " zmienna3:" + zmienna3);

        double zmiennaDouble1, zmiennaDouble2;
        zmiennaDouble1 = 1.500;
        zmiennaDouble2 = 2.500;
        System.out.print(zmiennaDouble1 + "\n" + zmiennaDouble2 + "\n");

        System.out.print(" |--- /---\\ |    | /---\\"+ "\n");
        System.out.print("    | |   | |    | |   |"+ "\n");
        System.out.print("    | |   | |    | |   |"+ "\n");
        System.out.print("    | |---|  \\  /  |---|"+ "\n");
        System.out.print(" \\__/ |   |   \\/   |   |"+ "\n\n");


        int argument1 = 27;
        int argument2 = 12;
        int wynikdodawania = argument1 + argument2;
        int wynikmnozenia = argument1 * argument2;
        int wynikodejmowania = argument1 - argument2;
        double wynikdzielenia = (double)argument1 / argument2; // jedna ze zmiennych musi byc zmiennoprzecinkowa
        int wynikmodulo = argument1 % argument2;
        int wynikinkrementacji = ++argument1;
        int wynikdekrementacji = --argument2;

        System.out.println("Wynik dodawania: " + wynikdodawania);
        System.out.println("Wynik odejmowania: " +wynikodejmowania);
        System.out.println("Wynik mnozenia: " +wynikmnozenia);
        System.out.println("Wynik dzielenia: " +wynikdzielenia);
        System.out.println("Wynik modulo: " +wynikmodulo);
        System.out.println("Inkrementacja argumentu1: " +wynikinkrementacji);
        System.out.println("Dekrementacja argumentu2 " +wynikdekrementacji);

        int x=3;
        int y;
        System.out.println(x--); //3
        System.out.println(--x); //2
        System.out.println(x); //1
        y = x--; // y=1
        System.out.println(y); // 1
        y = --x; // y=0
        System.out.println(y); //-1
        System.out.println(--y); //-2

        int wartosc = 2147483647; //zakres int
        System.out.println(wartosc+1);
        System.out.println((long)wartosc+1);



            }
}
