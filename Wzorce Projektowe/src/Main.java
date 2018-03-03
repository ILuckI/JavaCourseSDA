import WzorzecStrategia.ObliczPodatek.*;
import WzorzecStrategia.Sortowanie.Sortowanie;
import WzorzecStrategia.Sortowanie.*;

public class Main {

    public static void main(String[] args) {

        int[] input = {2, 1, 3, 5, 4};
        double input2 = 1000.0;

        Sortowanie sortowanie = new Sortowanie();
        sortowanie.wykonajSort(input);
        sortowanie.setSortowanieInterface(new Zliczenie());
        sortowanie.wykonajSort(input);

        Calculate calculate = new Calculate(new Polak());
        calculate.wykonajObliczenie(input2);
        calculate.pokazWynik(input2);


    }
}
