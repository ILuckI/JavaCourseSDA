public class House {
    private String number;
    private String street;
    private String city;
    private String postalCode;
    private int floors = 1;

    public House(String number, String street, String city, String postalCode) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public House(String number, String street, String city, String postalCode, int floors) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.floors = floors;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityAndPostal() {
        StringBuilder sb = new StringBuilder();
        sb.append("City[city=").append(city).append(", postalCode=").append(postalCode).append("]");
        return sb.toString();
    }

    public void setCityAndPostal(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("House[street=").append(street).append(",number=").append(number).append(",city=").append(city).append(",postalCode=").append(postalCode).append(",floors=").append(floors).append("]");
        return sb.toString();
    }
}
