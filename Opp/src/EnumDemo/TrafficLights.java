package EnumDemo;

public enum TrafficLights{
    RED(30){
       public TrafficLights next(){
           return AMBER;
       }
    }, AMBER(10){
        public TrafficLights next(){
            return GREEN;
        }
    }, GREEN(30){
        @Override
        public TrafficLights next(){
            return RED;
        }
    };
    private final int seconds;

    TrafficLights(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    public abstract TrafficLights next();
}
