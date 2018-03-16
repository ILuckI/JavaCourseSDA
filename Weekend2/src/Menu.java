import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nMENU \n1:Podaj 2 liczby dodatnie\n2:Oblicz obwod\n3:Podaj promien i oblicz objetosc kuli\n4:Powierzchnia kwadratu\n0: Koniec programu");
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
                    System.out.println("Obwod wynosi " + 2 * (a + b));
                    break;
                case 3: //Podaj promien i oblicz objetosc kuli
                    System.out.print("Podaj dlugosc promienia : ");
                    int promien1 = sc.nextInt();
                    double objetoscKuli = 4 / 3 * Math.PI * (Math.pow(promien1, 3.0));
                    System.out.println("Objetosc kuli wynosi: " + objetoscKuli);
                    break;
                case 4: //Powierzchnia kwadratu
                    System.out.print("Podaj wartosc promienia : ");
                    int promien = sc.nextInt();
                    double promientak = 2 * Math.pow(promien, 2.0);
                    System.out.println("Polepowierzchni kwadratu wynosi :" + promientak);
                    break;
                default:
                    System.out.println("Error");

            }
        }
    }

}
