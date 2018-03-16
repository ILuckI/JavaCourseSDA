public class MainCircle {
    public static void main(String[] args) {

        Circle cr1 = new Circle();
        Circle cr2 = new Circle(3);
        System.out.println(cr1);
        System.out.println(cr2);

        Rectangle ret1 = new Rectangle();
        Rectangle ret2 = new Rectangle(1.0f, 2.0f);
        System.out.println(ret1);
        System.out.println(ret2);

        Employee emp1 = new Employee(1, "Lukasz", "Szubart", 10000);
        Employee emp2 = new Employee(2, "Robert", "Kowalski", 2500);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.raiseSalary(50));

        Account ac1 = new Account("100223", "Roman Polanski");
        Account ac2 = new Account("103323", "Oscar Sandeza", 1000);
        System.out.println(ac1.debit(300));
        System.out.println(ac2.credit(10000));

        Data dat =new Data(17,12,2017);
        System.out.println("Dzisiaj jest " + dat);
        dat.setDate(8,6,2017);
        System.out.println(dat);

        Time time1 = new Time(10, 00, 00);
        System.out.println(time1.nextSecond());
        System.out.println(time1.previousSecond());


    }


}
