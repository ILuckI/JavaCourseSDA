package Zajecia0302.MyDeck;

public class CardShufflingDemo {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.printAll();
        System.out.println("----------------------------------");

        deck.Shuffling();
        deck.printAll();
    }
}
