package WczytanieLiter.ZliczanieMapy;

import java.io.FileNotFoundException;

public class ZliczanieDemo {
    public static void main(String[] args) {
        OdczytKsiazki odczytKsiazki=new OdczytKsiazki("C:\\Users\\Lenovo\\Desktop\\SDA\\Algorytmy\\src\\WczytanieLiter\\txt.txt");
        try {
            odczytKsiazki.czytaj();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
