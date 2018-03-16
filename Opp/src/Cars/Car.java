package Cars;

public class Car {
    private String producer;
    private String model;
    private Wheel wheel ;
    private Engine engine ;

    public Car(String producer, String model, String wheelProducer, String wheelModel, String engineProducer, String engineModel, int enginePower ) {
        this.producer = producer;
        this.model = model;
        wheel = new Wheel(wheelProducer,wheelModel);
        engine = new Engine(engineProducer,engineModel,enginePower);
    }
    public Car(String producer, String model, Wheel wheel, String engineProducer, String engineModel, int enginePower ) {
        this.producer = producer;
        this.model = model;
        this.wheel = wheel;
        engine = new Engine(engineProducer,engineModel,enginePower);
    }

    public Car(String producer, String model, Wheel wheel, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void changeWheel(Wheel newWheel) {
        this.wheel = newWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public int tuning (int tuning){
        this.engine.tuning(tuning);
        return tuning;
    }
    public int ride (int kilometers){
        this.wheel.ride(kilometers);
        return kilometers;
    }
    public void turnOff(){
        this.engine.stopEngine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb = sb.append("Car[producer= ").append(producer).append(", model= ").append(model).append(wheel.toString()).append(engine.toString());
        return sb.toString();
    }
}
