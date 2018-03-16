package Cars;

public class CarTest {
    public static void main(String[] args) {

        Engine engineTest1 = new Engine("Audi","S8322-18",150);
        System.out.println(engineTest1);

        Wheel tireTest1 = new Wheel("Pirelli","Sport-GT18205",false, 50);
        System.out.println(tireTest1);

        Car car1 = new Car("Ford","Mustang", tireTest1, engineTest1);
        System.out.println(car1);

        Car car2 = new Car("Audi","A6","Pirelli","Sport Snow 18/205","Audi Diesel","Turbo 2.0 TDI", 165);
        System.out.println(car2);

        System.out.println(car1.equals(car2));
        System.out.println(car2.tuning(200));
    }
}
