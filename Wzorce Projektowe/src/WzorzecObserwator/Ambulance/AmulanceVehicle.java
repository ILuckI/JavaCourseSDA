package WzorzecObserwator.Ambulance;

public class AmulanceVehicle implements Ambulance {
    Operator operator;
    static int number;
    int ourNumber;

    public AmulanceVehicle(Operator operator) {
        this.operator = operator;
        this.operator.registerObserver(this);
        ourNumber = number++;
    }

    @Override
    public void update(String accident) {
        System.out.println("Ambulance " + ourNumber + "jedzie do " + accident);
    }
}
