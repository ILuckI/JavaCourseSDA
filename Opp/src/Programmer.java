public class Programmer {
    private String name;
    private String surname;
    private String favoriteCodingLanguage;
    private int skillLevel = 1;

    public Programmer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Programmer(String name, String surname, String favoriteCodingLanguage) {
        this.name = name;
        this.surname = surname;
        this.favoriteCodingLanguage = favoriteCodingLanguage;
    }

    public Programmer(String name, String surname, String favoriteCodingLanguage, int skillLevel) {
        this.name = name;
        this.surname = surname;
        this.favoriteCodingLanguage = favoriteCodingLanguage;
        if (skillLevel >= 1 && skillLevel <= 10)
             this.skillLevel = skillLevel;
        else
            System.out.println("Enter correct skillLevel (1 - 10)");
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public void changePersonalData(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getPersonalData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programmer[name=").append(name).append(", surname=").append(surname);
        return sb.toString();
    }

    public String getFavoriteCodingLanguage() {
        return favoriteCodingLanguage;
    }

    public void setFavoriteCodingLanguage(String favoriteCodingLanguage) {
        this.favoriteCodingLanguage = favoriteCodingLanguage;
    }

    public void learn() {
        skillLevel += 1;
        if (skillLevel <= 0)
            System.out.println("You are really kind of knowledge! Start learn dude!");
        else if (skillLevel > 10)
            System.out.println("You are really kind of knowledge! Slow down dude!");
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programmer[name=").append(name).append(", surname=").append(surname).append(", language=").append(favoriteCodingLanguage).append(", skillLevel=").append(skillLevel);
        return sb.toString();
    }
}
