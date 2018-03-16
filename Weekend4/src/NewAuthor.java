public class NewAuthor {
    private String name;
    private String email;
    private char gender;

    public NewAuthor(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author[name=").append(name).append(", email=").append(email).append(", gender=").append(gender).append("]");
        return sb.toString();
    }
}
