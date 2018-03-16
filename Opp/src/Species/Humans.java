package Species;

public class Humans extends Species {
    private String typeName = "Humans";
    private String speciesName = "Humans";
    private String skinColor = "White";
    private String eyeColor = "Green";
    private String hairColor = "Black";
    private int age = 21;
    private int height = 180;
    private int weight = 80;

    public Humans() {
    }

    public Humans(int age, int height, int weight) {
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }

    public Humans(String skinColor, String eyeColor, String hairColor) {
        setSkinColor(skinColor);
        setEyeColor(eyeColor);
        setHairColor(hairColor);

    }

    public Humans(String skinColor, String eyeColor, String hairColor, int age, int height, int weight) {
        setSkinColor(skinColor);
        setEyeColor(eyeColor);
        setHairColor(hairColor);
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
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

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setAge(int age) {
        if (age > 100 || age < 1)
            System.out.println("This Human can not exist");
        else
            this.age = age;
    }

    public void setHeight(int height) {
        if (height > 220 || height < 60)
            System.out.println("This Human can not exist");
        else
            this.height = height;
    }

    public void setWeight(int weight) {
        if (weight > 200 || weight < 4)
            System.out.println("This Human can not exist");
        else
            this.weight = weight;
    }

    @Override
    public void behavior() {
        System.out.println("Desires of absolute power, aggressive and valiant");
    }

    @Override
    public void description() {
        System.out.println("We are like a virus, we find, exploit and finaly destroy");
    }

    @Override
    public void specialCharacters() {
        System.out.println("two legs, two hands");

    }

    @Override
    public void ageOfExistance() {
        System.out.println("Seven million years");

    }

    @Override
    public void homeWorld() {
        System.out.println("Earth, Solar system");

    }

    @Override
    public void multiplication() {
        System.out.println("Fertilization of the female by the male");
    }
}
