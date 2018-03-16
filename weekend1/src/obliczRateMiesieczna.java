public class obliczRateMiesieczna {
    public static void main(String[] args) {

        double cenaTowaru = 3500.0;
        double liczbaRat12 = 0.025 * cenaTowaru;
        double liczbaRat24 = 0.05 * cenaTowaru;
        double liczbaRat48 = 0.1 * cenaTowaru;
        double q = 1 + (0.05 / 12);

        double rataMiesieczna12 = cenaTowaru * Math.pow(q, 12) * (q - 1) / (Math.pow(q, 12) - 1);
        double rataMiesieczna24 = cenaTowaru * Math.pow(q, 24) * (q - 1) / (Math.pow(q, 24) - 1);
        double rataMiesieczna48 = cenaTowaru * Math.pow(q, 48) * (q - 1) / (Math.pow(q, 48) - 1);

        if (cenaTowaru < 100)
            System.out.println("Cena produktu jest zbyt niska by podzielic ja na raty.");
        else if (cenaTowaru > 10000)
            System.out.println("Produkt jest zbyt drogi!!! Limit kredytu wynosi 10 000zl");
        else {
            System.out.print("Koszt sprzetu AGD: " + cenaTowaru + "zl \n" + "W ratach na 1 rok : ");
            System.out.printf("%3.2f", rataMiesieczna12);
            System.out.println(" zl /miesiecznie");

            System.out.print("W ratach na 2 lata : ");
            System.out.printf("%3.2f", rataMiesieczna24);
            System.out.println(" zl /miesiecznie");

            System.out.print("W ratach na 4 lata : ");
            System.out.printf("%3.2f", rataMiesieczna48);
            System.out.println(" zl /miesiecznie");

        }


    }
}
