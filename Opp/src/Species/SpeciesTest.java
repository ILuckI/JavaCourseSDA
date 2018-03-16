package Species;

public class SpeciesTest {
    public static void main(String[] args) {

        Species alien = new Aliens();
        Aliens alien1 = new Aliens(18,216,2000);
        Species human = new Humans();
        Humans newHuman = new Humans("Black","Blue","Black");

        System.out.println("Aliens:");
        alien.description();
        alien.ageOfExistance();
        alien.behavior();
        alien.specialCharacters();

        System.out.println("Humans:");
        human.description();
        human.multiplication();
        human.behavior();
        human.homeWorld();

        System.out.println("\nLet`s test\n");
        System.out.println(human.equals(alien));
        System.out.println(human.getClass());
        System.out.println(Species.multiplies);
        System.out.println(alien.equals(alien1));
        System.out.println(Species.intelligentFormOfLife);

        newHuman.setAge(22);
        newHuman.setWeight(88);
        newHuman.setHeight(82);
        System.out.println(newHuman.getAge());

        alien1.clone();
    }
}
