package WzorzecObserwator.Ambulance;

import java.util.ArrayList;

public class OperatorAdam implements Operator {
    private ArrayList<Ambulance> allAmbulance = new ArrayList<>();

    @Override
    public void registerObserver(Ambulance ambulance) {
        allAmbulance.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        allAmbulance.remove(ambulance);
    }

    @Override
    public void notifyObserver(String accident) {
        for (Ambulance ambulance : allAmbulance) {
            ambulance.update(accident);
        }
    }
}
