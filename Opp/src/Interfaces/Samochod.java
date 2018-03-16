package Interfaces;

public class Samochod implements CzteroKolowy {

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Ale jazda!!!");
    }

    @Override
    public void jedz() {
        System.out.println("Jade!");

    }

    @Override
    public void hamuj() {
        System.out.println("Stop!");

    }
}
