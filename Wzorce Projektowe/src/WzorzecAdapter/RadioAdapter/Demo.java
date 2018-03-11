package WzorzecAdapter.RadioAdapter;

public class Demo {
    public static void main(String[] args) {
        AnalogSignal radioFm = new RadioFm(24);
        DigitalSignal radioAdapter = new RadioAdapter(radioFm);

        radioAdapter.printDigital();
    }
}
