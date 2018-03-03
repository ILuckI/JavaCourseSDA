package WzorzecStrategia.ObliczPodatek;

public class Niemiec implements CalculateInterface {


    @Override
    public double obliczPodatek(double netto) {
        return netto * 0.30;
    }
}
