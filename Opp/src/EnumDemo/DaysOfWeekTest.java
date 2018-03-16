package EnumDemo;

public class DaysOfWeekTest {
    public static void main(String[] args) {

        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.printf("%s : %s\n", day, day.next());
        }
    }
}
