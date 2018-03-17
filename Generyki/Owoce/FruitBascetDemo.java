package Generyki.Owoce;

public class FruitBascetDemo {
    public static void main(String[] args) {
        FruitBasket<Jabłko> fruitBasket=new FruitBasket();
        fruitBasket.setOwoc(new Jabłko());
        fruitBasket.getOwoc().pobierzOwoc();
    }
}
