package Interfaces;

public class Rower implements Dwukolowy {


    @Override
    public void przewrocSie() {
        System.out.println("Ale sie wyjebalem na rowerze :)");
    }

    @Override
    public void zaparkuj() {

    }

    @Override
    public void jedz() {
        System.out.println("Jade rowerem!");

    }

    @Override
    public void hamuj() {
        System.out.println("Stop!");

    }
}
