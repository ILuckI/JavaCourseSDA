public class obliczPodatek {
    public static void main(String[] args) {

        double zarobekLimit = 85528;
        double twojZarobek = 75528;
        double podatek1 = 0.18 * twojZarobek - 556.02;
        double nadwyzka = 0.32 * (twojZarobek - zarobekLimit);
        double podatek2 = 14839.02 + nadwyzka;

        System.out.println("I prog podatkowy jest do 85528 zl\nII prog podatkowy jest powyzej 85528 zl \n");
        if (twojZarobek > 85528) {
            System.out.print("Zarobiles w tym roku : " + twojZarobek + " zl\n" + "Miescisz sie w II progu podatkowym a twoj podatek wynosi : ");
            System.out.printf("%3.2f",podatek2);
            System.out.println(" zl" + "\nMilego dnia!");
        }
        else{
            System.out.print("Zarobiles w tym roku : " + twojZarobek + " zl\n" + "Miescisz sie w I progu podatkowym a twoj podatek wynosi : ");
            System.out.printf("%3.2f",podatek1);
            System.out.println(" zl" + "\nMilego dnia!");
        }

    }
}
