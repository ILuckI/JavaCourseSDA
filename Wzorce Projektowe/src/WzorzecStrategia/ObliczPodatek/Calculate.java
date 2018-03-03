package WzorzecStrategia.ObliczPodatek;

public class Calculate {
    protected CalculateInterface calculate;

    public Calculate(CalculateInterface nationality) {
        this.calculate = nationality ;
    }

    public void wykonajObliczenie(double netto) {
        calculate.obliczPodatek(netto);
    }

    public void setCalculate(CalculateInterface calculate) {
        this.calculate = calculate;
    }

    public void pokazWynik(double input){
        System.out.println(calculate.obliczPodatek(input));

    }

}
