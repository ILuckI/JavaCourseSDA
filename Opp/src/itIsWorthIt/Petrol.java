package itIsWorthIt;

public class Petrol extends Cars {
    private String model;
    private double petrolCarCost;
    private double petrolCombustion;

    public Petrol(String model, double petrolCarCost, double petrolCombustion) {
        this.model = model;
        this.petrolCarCost = petrolCarCost;
        this.petrolCombustion = petrolCombustion;
    }

    public double costOfOneKilometers(double distance) {
        double kilometersof100 = (petrolCombustion * petrolCost) / 100;
        distance = distance * kilometersof100;
        return (int )distance;
    }

    public double getPetrolCarCost() {
        return petrolCarCost;
    }

    // Repairs related to engine failures
    public double getPossiblePepairs(){
        int ecoboost = 3000;                    // Special EcoBoost engines only
        return ecoboost;
    }
}
