package Cars;

public class Engine {
    private String producer;
    private String model;
    private int power;
    private boolean isRunning = false;

    public Engine(String producer, String model, int power) {
        this.producer = producer;
        this.model = model;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public void tuning(int percent) {
        power = power + (power * percent) / 100;
    }

    public void startEngine() {
        isRunning = true;
        System.out.println("Engine is Running");
    }

    public void stopEngine() {
        isRunning = false;
        System.out.println("Engine is turn off");
    }

    public boolean isEngineRunning() {
        if (isRunning != isRunning)
            isRunning = true;
        return isRunning;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append("Engine[producer= ").append(producer).append(", model= ").append(model).append(", power= ").append(power).append(isEngineRunning()).append("]").toString();
    }
}
