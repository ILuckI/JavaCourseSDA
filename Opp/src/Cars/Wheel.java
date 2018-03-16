package Cars;

public class Wheel {

    private String producer;
    private String model;
    private boolean isWinterTire = false;
    private int percentOfUseTread = 100;

    public Wheel(String producer, String model) {
        this.producer = producer;
        this.model = model;

    }

    public Wheel(String producer, String model, boolean isWinterTire) {
        this.producer = producer;
        this.model = model;
        this.isWinterTire = isWinterTire;

    }

    public Wheel(String producer, String model, boolean isWinterTire, int percentOfUseTread) {
        this.producer = producer;
        this.model = model;
        this.isWinterTire = isWinterTire;
        this.percentOfUseTread = percentOfUseTread;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public boolean cheackifWinterTire() {
        if (isWinterTire != isWinterTire)
            isWinterTire = true;
        return isWinterTire;
    }

    public int cheackTread() {
        return percentOfUseTread;
    }

    public void ride(int kilometers) {
        if (kilometers >= 100)
            percentOfUseTread -= 1;
        if (percentOfUseTread < 10 && kilometers >= 100)
            System.out.println("You can`t drive this car");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Whell[producer= ").append(producer).append(", model= ").append(model).append(", ").append(cheackifWinterTire()).append(", procentOfUseTread= ").append(percentOfUseTread).append("]").toString();
    }
}
