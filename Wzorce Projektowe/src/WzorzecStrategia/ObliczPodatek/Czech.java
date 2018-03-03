package WzorzecStrategia.ObliczPodatek;

public class Czech implements CalculateInterface {

    @Override
    public double obliczPodatek(double netto) {
        double obliczenie ;
        obliczenie = netto * 0.10;
        System.out.println(obliczenie);
        return obliczenie;
    }
}
