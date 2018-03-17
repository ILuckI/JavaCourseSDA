package Zajecia1003.Refleksja.Wypozyczalnia;

public class RentCar {
    private int rate;
    private String type;
    public int price;

    public RentCar(int length) {
        if (length < 455) {
            rate = 35;
            type = "Auto małe";

        } else if (length >= 455 && length < 495) {
            rate = 45;
            type = "Auto srednie";
        }
        else if(length >= 495) {
            rate = 55;
            type = "Auto duze";
        }
    }

    public int getRate() {
        return rate;
    }
    public String getType() {
        return type;
    }
    public void setRate(int rate){
        this.rate=rate;
    }
    public void setType(String type){
        this.type=type;
    }
    public void rentalCoast(int ileDni){
        price=ileDni*rate;
        System.out.println(price);
    }


}
