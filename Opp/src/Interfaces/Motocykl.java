package Interfaces;

public class Motocykl implements Dwukolowy {

    @Override
    public void przewrocSie() {
        System.out.println("Ale sie wyjebalem :)");
    }

    @Override
    public void zaparkuj() {
        System.out.println("Parkuje");
    }

    @Override
    public void jedz() {
        System.out.println("Jade!");

    }

    @Override
    public void hamuj() {
        System.out.println("Stop!");

    }
    public void dodajGazu(){
        System.out.println("GAZUJE!");
    }
}
