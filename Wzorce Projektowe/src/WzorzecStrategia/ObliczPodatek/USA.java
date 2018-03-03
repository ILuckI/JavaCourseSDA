package WzorzecStrategia.ObliczPodatek;

public class USA implements CalculateInterface {
    @Override
    public double obliczPodatek(double netto) {
        return netto * 0.15;
    }
}
