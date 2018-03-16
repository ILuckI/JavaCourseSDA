
package itIsWorthIt;

import java.util.Random;

public class Diesel extends Cars {
    Random rnd = new Random();
    private String model;
    private double dieselCarCost;
    private double dieselCombustion;
    private int possibleCalculate = 0;

    public Diesel(String model, double dieselCarCost, double dieselCombustion) {
        this.model = model;
        this.dieselCarCost = dieselCarCost;
        this.dieselCombustion = dieselCombustion;
        getPossiblePepairs();
    }


    public double costOfOneKilometers(double distance) {
        double kilometersof100 = (dieselCombustion * dieselCost) / 100;
        distance = distance * kilometersof100;
        return (int) distance;
    }

    public double getDieselCarCost() {
        return dieselCarCost;
    }

    // Repairs related to engine failures
    public double getPossiblePepairs() {
        possible = randomRepairsGenerator();
        if (possible == 1)
            possibleCalculate = 1500;                       // Turbosprężarka
        if (possible == 1)
            possibleCalculate += 2000;                  // Układ wtryskowy
        if (possible == 1)
            possibleCalculate += 2000;              // Koło dwumasowe
        if (possible == 1)
            possibleCalculate += 500;           // Filtr cząstek stałych
        return possibleCalculate;
    }
}
