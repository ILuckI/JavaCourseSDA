package WypozyczalniaRefleksja;

public class RentCar {

    private int rate;
    private String type;
    public int price;

    public RentCar (int size){
        if (size < 455){
            type = "Small";
            rate = 35;
        }
        else if (size >= 455 && size < 495){
            type = "Mid-Sized";
            rate = 45;
        }
        else if (size >= 495){
            type = "Large";
            rate = 55;
        }
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void computerRentalCost(int numberDays){
        price = rate * numberDays;
        System.out.printf("Calkowity koszt wypozyczenia samochodu :" + price);

    }

}
