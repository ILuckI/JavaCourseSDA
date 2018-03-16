package itIsWorthIt;

public class Gas extends Cars {
    private String model;
    private double gasCarCost;
    private double gasCombustion;

    public Gas(String model, double gasCarCost, double gasCombustion, int lpgInstalationCost) {
        this.model = model;
        setGasCarCost(gasCarCost, lpgInstalationCost);
        this.gasCombustion = gasCombustion;
    }

    private void setGasCarCost(double gasCarCost, double lpgInstalationCost) {
        this.gasCarCost = gasCarCost + lpgInstalationCost;
    }

    public double costOfOneKilometers(double distance) {
        double kilometersof100 = (gasCombustion * gasCost) / 100;
        distance = distance * kilometersof100;
        return (int )distance;
    }

    public double getGasCarCost() {
        return gasCarCost;
    }

    // Repairs related to engine failures
    public double getPossiblePepairs(){
        int repairInstalation = 1000;
        return repairInstalation;
    }
}
