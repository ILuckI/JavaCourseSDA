package Watki.ProducentKonsument;

import java.util.Scanner;

public class Procesor {
    public void produce()throws InterruptedException{
        synchronized (this){
            System.out.println("Kucharz sie uruchomill");
            wait();
            System.out.println("Kucharz donosi jedzenie");
        }
    }
    public  void consume() throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        Thread.sleep(1000);
        synchronized (this){
            System.out.println("Klient zjadł. Nacisnij Enter, zeby przywolac kelnera.");
            sc.nextLine();
            System.out.println("Przywolujemy kelnera");
            notify();
        }
    }
}
