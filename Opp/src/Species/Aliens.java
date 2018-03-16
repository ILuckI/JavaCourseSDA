package Species;

public class Aliens extends Species {
    private String typeName = "Aliens";
    private String speciesName = "Xenomorph";
    private int age = 21;
    private int height = 210;
    private int weight = 1500;

    public Aliens() {
    }

    public Aliens(int age, int height, int weight) {
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public void setAge(int age) {
        if (age > 100 || age < 1)
            System.out.println("This Alien can not exist");
        else
            this.age = age;
    }

    public void setHeight(int height) {
        if (height > 310 || height < 120)
            System.out.println("This Alien can not exist");
        else
            this.height = height;
    }

    public void setWeight(int weight) {
        if (weight > 4500 || weight < 250)
            System.out.println("This Human can not exist");
        else
            this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public void behavior() {
        System.out.println("Fast, agile, aggressive. Most important for the queen to survive");
    }

    @Override
    public void description() {
        System.out.println("Moves like a monkey on his arms and legs. Climbs, runs on the walls and ceilings, floats.");

    }

    @Override
    public void specialCharacters() {
        System.out.println("Long and sharp tail, banana-shaped head");

    }

    @Override
    public void ageOfExistance() {
        System.out.println("seventeen million years");
    }

    @Override
    public void homeWorld() {
        System.out.println("Probably almost every");
    }

    @Override
    public void multiplication() {
        System.out.println("Parthenogenesis. From an unfertilized egg placed by the queen, eight foot face are hovered whose task is to start another stage in the body of the final carrier");
    }

    public Aliens clone() {
        Aliens newAlien = new Aliens();
        newAlien.age = this.age;
        newAlien.height = this.height;
        newAlien.weight = this.weight;
        return newAlien;
    }
}
