public class author {
    String name;
    String surname;
    String country;

    public String returnAuthorName() {
        return name;
    }

    public String returnAuthorSurname() {
        return surname;
    }

    public String returnAuthorCountry() {
        return country;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

    public void setCountry(String newCountry) {
        country = newCountry;
    }
}

