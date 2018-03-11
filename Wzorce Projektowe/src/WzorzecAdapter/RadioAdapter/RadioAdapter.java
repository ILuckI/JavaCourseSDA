package WzorzecAdapter.RadioAdapter;

public class RadioAdapter implements DigitalSignal {
    AnalogSignal radioFm;

    public RadioAdapter(AnalogSignal analogSignal) {
        radioFm = analogSignal;
    }

    @Override
    public int[] getDigital() {

        int analogSignalLength = radioFm.getAnalog().length /8 ;

        int[] temp = new int[analogSignalLength];
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < analogSignalLength; i ++) {
            for (int j = 0; j < 8; j++) {
                if (radioFm.getAnalog()[counter] > 1.0)
                    sum+= Math.pow(2.0, j);
                counter++;
            }
            temp[i] = sum;
            sum = 0;

        }
        return temp;
    }

    @Override
    public void setDigital(int[] digitalData) {
        // pusta metoda
    }

    @Override
    public void printDigital() {
        int[] digits = getDigital();
        for (int i : digits) {
            System.out.printf("%d", i);

        }

    }
}