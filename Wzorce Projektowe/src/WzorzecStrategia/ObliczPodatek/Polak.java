package WzorzecStrategia.ObliczPodatek;

public class Polak implements CalculateInterface {
    @Override
    public double obliczPodatek(double netto) {
        return netto * 0.23;
    }
}
