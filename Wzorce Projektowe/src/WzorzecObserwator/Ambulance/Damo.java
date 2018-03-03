package WzorzecObserwator.Ambulance;

public class Damo {
    public static void main(String[] args) {

        OperatorAdam adam = new OperatorAdam();
        AmulanceVehicle amb1 = new AmulanceVehicle(adam);
        AmulanceVehicle amb2 = new AmulanceVehicle(adam);
        AmulanceVehicle amb3 = new AmulanceVehicle(adam);

        adam.notifyObserver("Wypadek samochodowy");
        adam.notifyObserver("Przejechany walcem");

    }
}
