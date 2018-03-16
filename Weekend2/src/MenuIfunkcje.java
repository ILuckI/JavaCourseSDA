import java.util.Scanner;

public class MenuIfunkcje {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

            while (true) {
            System.out.println("\nMENU \n1:Podaj 2 liczby dodatnie\n2:Oblicz obwod\n3:Podaj promien i oblicz objetosc kuli\n4:Pole kwadratu wpisanego w okreg\n0: Koniec programu");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    return;
                case 1: //Podaj 2 liczby dodatnie
                    System.out.print("Podaj wartosc boku a : ");
                    int boka = sc.nextInt();
                    System.out.print("Podaj wartosc boku b : ");
                    int bokb = sc.nextInt();
                    if (boka > 0 && bokb > 0)
                        System.out.println("bok a :" + boka + "\nbok b :" + bokb);
                    else
                        System.out.println("Podaj wartosci dodatnie!");
                    break;
                case 2: //Oblicz obwod
                    System.out.print("Podaj wartosc boku a : ");
                    int a = sc.nextInt();
                    System.out.print("Podaj wartosc boku b : ");
                    int b = sc.nextInt();
                    System.out.println(obliczObwod(a,b));
                    break;
                case 3: //Podaj promien i oblicz objetosc kuli
                    System.out.print("Podaj dlugosc promienia : ");
                    int promien1 = sc.nextInt();
                    System.out.println("Objetosc kuli wynosi: " + obliczKule(promien1));
                    break;
                case 4: //Powierzchnia kwadratu
                    powierzchniaKwadratu();
                    break;
                default:
                    System.out.println("Error");

            }
        }
    }

    public static int obliczObwod(int x, int y) {
        return 2 * (x + y);
    }
    public static double obliczKule(int x) {
        return 4 / 3 * Math.PI * (Math.pow(x, 3.0));
    }
    public static void powierzchniaKwadratu() {
        System.out.print("Podaj wartosc promienia : ");
        int promien = sc.nextInt();
        double promienTak =  2 * Math.pow(promien, 2.0);
        System.out.println(promienTak);
    }
}