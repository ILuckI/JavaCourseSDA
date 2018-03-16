package Zajecia0302.MyDeck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();               // Tworzymy liste kart

    public Deck() {
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 3; j++) {
                deck.add(new Card(Color.getValueBasedOnInt(j), Figures.getValueBasedInInt(i)));     // Tworzymy karty
            }                                                                                       // kolor i figura tworzone przez petle i metody
        }
    }

    public void printAll() {                                      // drukujemy karty
        for (Card card : deck) {                                  // z deck szukamy card i drukujemy wynik
            System.out.println(card);                             // formatowanie ustawione metoda toString
        }

    }

    public void Shuffling() {
        Collections.shuffle(deck);
    }
}
