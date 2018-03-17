package Generyki;

public class WalizkaDemo {
    public static void main(String[] args) {
        Walizka<Sweter> walizka=new Walizka();
        walizka.getPrzedmiot();
        walizka.setPrzedmiot(new Sweter("sweter"));
        walizka.getPrzedmiot().zlozUbranie();

    }
}
