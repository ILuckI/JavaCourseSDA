public class zadanie1 {
    public static void main(String[] args) {  //psvm
        System.out.println("Zadanie 1");
        int a=10, b=3, c=2;
        int d = a % b % c;
        System.out.println(d +"\n");

        System.out.println("Zadanie 2");
        int minuta=51, godzina=14, rok=2017, miesiac=11, dzien=23;
        System.out.println(godzina + ":" + minuta +"\t" + dzien + "." + miesiac + "." + rok + "\n");

        System.out.println("Zadanie 3");
        int minuty;
        minuty = godzina * 60  + minuta ;
        System.out.println("\tMinely : " + minuty + " minuty od godziny 24:00" + "\n");

        System.out.println("Zadanie 4");
        int procenty =(minuty*100/1440);
        System.out.println("\tMinelo : " + procenty + "% doby od godziny 24:00" + "\n");

        System.out.println("Zadanie 5");
        int sekund;
        sekund = (1440 * 60 ) - (minuty * 60);
        System.out.println("\tZostalo : " +sekund + " do godziny 24:00" + "\n");

    }
}
