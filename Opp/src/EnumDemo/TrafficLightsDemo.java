package EnumDemo;

public class TrafficLightsDemo {
    public static void main(String[] args) {

        for (TrafficLights light: TrafficLights.values()) {
            System.out.printf("%s : %d : %s \n",light, light.getSeconds(),light.next());

        }

    }
}
