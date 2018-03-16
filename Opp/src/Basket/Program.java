package Basket;

public class Program {
    public static void main(String[] args) {

        Product[] myBasket = {new GnR(), new NocnyKochanek(), new NocnyKochanek(), new GnR()};

        int wartoscKoszyka = 0;
        for (int i = 0; i < myBasket.length ; i++) {
            wartoscKoszyka += myBasket[i].getPrice();
        }

        System.out.println(wartoscKoszyka);

    }
}
