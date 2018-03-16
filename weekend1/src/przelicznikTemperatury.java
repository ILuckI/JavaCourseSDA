public class przelicznikTemperatury {
    public static void main(String[] args) {
        double stopnieCelcjusza = 4.9;
        double stopnieFarenheita = 1.8 * stopnieCelcjusza + 32.0;
        double stopnieKelwiny = stopnieCelcjusza + 273.15;

        System.out.println("Jest " + stopnieCelcjusza + " stopni celcjusza co odpowiada " + stopnieFarenheita + " stopni Farenheita a to odpowiada " + stopnieKelwiny + " jednostek Kelvina");

        if (stopnieCelcjusza < 10 && stopnieCelcjusza > 0)
            System.out.println("Jest zimniej niz 10 stopni. Prosze ubierz czapke!");

        else if (stopnieCelcjusza < 0)
            System.out.println("Mamy przymrozek. Zalecam herbatke z rumem.");

        else if (stopnieCelcjusza > 10 && stopnieCelcjusza < 20)
            System.out.println("Idzie wiosna, budzi sie zycie :)");

        else if (stopnieCelcjusza > 20 && stopnieCelcjusza < 35)
            System.out.println("Nareszcie cieplutko -.-");

        else
            System.out.println("Jest piekarnik! Pomocy!!! Smaze sie!!!");
    }
}

