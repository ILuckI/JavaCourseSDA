public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Lukasz","Szubart");
        Programmer programmer2 = new Programmer("Lukasz","Szubart","Java" );
        Programmer programmer3 = new Programmer("Lukasz","Szubart","Java", 3);

        System.out.println(programmer1);
        System.out.println(programmer2);
        System.out.println(programmer3);
        programmer3.learn();
        System.out.println(programmer3);

        Programmer programmer4 = new Programmer("Test","Konstruktora","Java",11);
        System.out.println(programmer4);
    }
}
