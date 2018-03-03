package WzorzecObserwator.Ambulance;

public interface Operator {
    void registerObserver(Ambulance ambulance);

    void removeObserver(Ambulance ambulance);

    void notifyObserver(String accident);
}
