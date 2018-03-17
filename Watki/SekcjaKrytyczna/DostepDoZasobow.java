package Watki.SekcjaKrytyczna;

public class DostepDoZasobow {
    private  int counter=0;

    public synchronized void increment(){
        if (counter==0)
            counter++;
    }
    public void print(){
        System.out.println(counter);
    }
}
