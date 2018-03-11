package WzorzecAdapter.RadioAdapter;

public class RadioDigital implements DigitalSignal {
    private int[] digital;

    public RadioDigital(int signalLenght) {
        digital = new int[signalLenght];
    }

    @Override
    public int[] getDigital() {
        return digital;
    }

    @Override
    public void setDigital(int[] digitalData) {
        this.digital = digitalData;
    }

    @Override
    public void printDigital() {
        for (int i : digital) {
            System.out.printf("%d", i);
        }

    }
}
