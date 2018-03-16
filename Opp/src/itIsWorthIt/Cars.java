package itIsWorthIt;
// nie mozna przeciazac i nadpisywac metodstatycznych. (overrade)
import java.util.Random;

public abstract class Cars {
    Random rnd = new Random();
    double dieselCost = 4.6;
    double petrolCost = 4.7;
    double gasCost = 2.1;
    int possible = 0;

    public String totalComapre(Cars diselcar, Cars petrolcar, Cars gasCar) {
        int month = 800;
        Diesel diesel = (Diesel) diselcar;
        Petrol petrol = (Petrol) petrolcar;
        Gas gas = (Gas) gasCar;
        StringBuilder sb = new StringBuilder();
        sb.append("Compare: Total ");
        sb.append("\nDiesel car cost per month: ").append(diesel.costOfOneKilometers(month)).append(" , per year: ").append(diesel.costOfOneKilometers(12 * month)).append(", 2 years: ").append(diesel.costOfOneKilometers(24 * month)).append(", five years: ").append(diesel.costOfOneKilometers(60 * month));
        sb.append("\nPetrol car cost per month: ").append(petrol.costOfOneKilometers(month)).append(" , per year: ").append(petrol.costOfOneKilometers(12 * month)).append(", 2 years: ").append(petrol.costOfOneKilometers(24 * month)).append(", five years: ").append(petrol.costOfOneKilometers(60 * month));
        sb.append("\nGasLPG car cost per month: ").append(gas.costOfOneKilometers(month)).append(" , per year: ").append(gas.costOfOneKilometers(12 * month)).append(", 2 years: ").append(gas.costOfOneKilometers(24 * month)).append(", five years: ").append(gas.costOfOneKilometers(60 * month)).append("\n");
        return sb.toString();
    }

    public String oneYearComapre(Cars diselcar, Cars petrolcar, Cars gasCar) {
        int year = 12 * 800;
        Diesel diesel = (Diesel) diselcar;
        Petrol petrol = (Petrol) petrolcar;
        Gas gas = (Gas) gasCar;
        StringBuilder sb = new StringBuilder();
        sb.append("Compare: One Year ");
        sb.append("\nDiesel compare to Petrol: ").append(diesel.costOfOneKilometers(year)).append(" - ").append(petrol.costOfOneKilometers(year)).append(" Difference: ").append(Math.abs(diesel.costOfOneKilometers(year) - petrol.costOfOneKilometers(year))).append("zl");
        sb.append("\nDiesel compare to GasLPG: ").append(diesel.costOfOneKilometers(year)).append(" - ").append(gas.costOfOneKilometers(year)).append(" Difference: ").append(Math.abs(diesel.costOfOneKilometers(year) - gas.costOfOneKilometers(year))).append("zl");
        sb.append("\nGasLPG compare to Petrol: ").append(gas.costOfOneKilometers(year)).append(" - ").append(petrol.costOfOneKilometers(year)).append(" Difference: ").append(Math.abs(gas.costOfOneKilometers(year) - petrol.costOfOneKilometers(year))).append("zl").append("\n");
        return sb.toString();
    }
    public String threeYearComapre(Cars diselcar, Cars petrolcar, Cars gasCar) {
        int threeYear = (3 * 12) * 800;
        Diesel diesel = (Diesel) diselcar;
        Petrol petrol = (Petrol) petrolcar;
        Gas gas = (Gas) gasCar;
        StringBuilder sb = new StringBuilder();
        sb.append("Compare: Three Years ");
        sb.append("\nDiesel compare to Petrol: ").append(diesel.costOfOneKilometers(threeYear)).append(" - ").append(petrol.costOfOneKilometers(threeYear)).append(" Difference: ").append(Math.abs(diesel.costOfOneKilometers(threeYear) - petrol.costOfOneKilometers(threeYear))).append("zl");
        sb.append("\nDiesel compare to GasLPG: ").append(diesel.costOfOneKilometers(threeYear)).append(" - ").append(gas.costOfOneKilometers(threeYear)).append(" Difference: ").append(Math.abs(diesel.costOfOneKilometers(threeYear) - gas.costOfOneKilometers(threeYear))).append("zl");
        sb.append("\nGasLPG compare to Petrol: ").append(gas.costOfOneKilometers(threeYear)).append(" - ").append(petrol.costOfOneKilometers(threeYear)).append(" Difference: ").append(Math.abs(gas.costOfOneKilometers(threeYear) - petrol.costOfOneKilometers(threeYear))).append("zl").append("\n");
        return sb.toString();
    }

    public String worstCaseScenario(Cars diselcar, Cars petrolcar, Cars gasCar){
        int threeYear = (3 * 12) * 800;
        Diesel diesel = (Diesel) diselcar;
        Petrol petrol = (Petrol) petrolcar;
        Gas gas = (Gas) gasCar;
        StringBuilder sb = new StringBuilder();
        sb.append("Compare: Worst case scenario after three years ");
        sb.append("\nDiesel | ").append("car cost: ").append(diesel.getDieselCarCost()).append(" + fuel costs: ").append(diesel.costOfOneKilometers(threeYear)).append(" + possible repairs: ").append(diesel.getPossiblePepairs()).append(" | TOTAL: ").append(diesel.getDieselCarCost()+ diesel.costOfOneKilometers(threeYear)+ diesel.getPossiblePepairs()).append(" |");
        sb.append("\nPetrol | ").append("car cost: ").append(petrol.getPetrolCarCost()).append(" + fuel costs: ").append(petrol.costOfOneKilometers(threeYear)).append(" + possible repairs: ").append(petrol.getPossiblePepairs()).append(" | TOTAL: ").append(petrol.getPetrolCarCost()+ petrol.costOfOneKilometers(threeYear)+ petrol.getPossiblePepairs()).append(" |");
        sb.append("\nGasLPG | ").append("car cost: ").append(gas.getGasCarCost()).append(" + fuel costs: ").append(gas.costOfOneKilometers(threeYear)).append(" + possible repairs: ").append(gas.getPossiblePepairs()).append(" | TOTAL: ").append(gas.getGasCarCost()+ gas.costOfOneKilometers(threeYear)+ gas.getPossiblePepairs()).append(" |");

        return sb.toString();
    }
        // Pracuje nad random generator dla jednorazowego scenariusza  (naprawy w kazdej klasie silnika sa inne)
    public int randomRepairsGenerator(){
        int repairRnd = rnd.nextInt(2);
        if ( repairRnd == 1)
            possible = repairRnd;
        return possible;
    }
}
