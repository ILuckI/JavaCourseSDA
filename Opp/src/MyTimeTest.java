public class MyTimeTest {
    public static void main(String[] args) {

        MyTime myTime = new MyTime(9,3,5);
        System.out.println(myTime);

        MyTime myTime1 = new MyTime(25,8,-15);
        System.out.println(myTime1);

        myTime1.setHour(0);
        myTime1.setMinute(0);
        myTime1.setSecond(0);
        System.out.println(myTime1);
        System.out.println(myTime1.previousSecond());
        myTime.setHour(23);
        myTime.setMinute(59);
        myTime.setSecond(59);
        System.out.println(myTime);
        System.out.println(myTime.nextSecond());
    }
}
