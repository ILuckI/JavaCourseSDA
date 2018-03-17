package Zajecia1003.Refleksja.Wypozyczalnia;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class WypozyczalniaRefleksja {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class rentCarClass=RentCar.class;
        System.out.println("Pełna nazwa klasy: "+ rentCarClass.getName());
        System.out.println("Skrocona nazwa klasy: "+rentCarClass.getSimpleName());
        System.out.println("Nazwa klasy canonical: "+rentCarClass.getCanonicalName());

        Package paczka=rentCarClass.getPackage();
        System.out.println("Nazwa paczki: "+paczka);

        //Tworzenie obiektow z wykorzystaniem kontruktorow
        //1.pobieranie konstruktorow
        Constructor[] constructors=rentCarClass.getConstructors();
        //2.pobieranie i zapisanie konkrektnego konstruktora
        Constructor constructor=rentCarClass.getConstructor(Integer.TYPE);
        //3.na podstawie konstruktora tworzymy obiekt
        RentCar rentCar=(RentCar) constructor.newInstance(123);
        System.out.println("Konstruktory: "+ Arrays.toString(constructors));

        //Pobieranie metod lub getMethod
        Method[] methods=rentCarClass.getDeclaredMethods();
        for (Method method :methods) {
            System.out.println(method.getName());
        }

        //Pobieranie konkretnej metody
        Method metoda=rentCarClass.getDeclaredMethod("rentalCoast",int.class);
        System.out.println("Metoda: "+metoda);

        //uruchomienie metody
        metoda.invoke(rentCar,45);// rent.rentalCoast(45);

        //pobieranie typow wejsciowych metody
        Class[] typyArgumentow=metoda.getParameterTypes();

        //pobieranie typu zwracanego
        Class zwracanyTyp=metoda.getReturnType();
        System.out.println("Typy: "+zwracanyTyp);

        //POLA
        Field[] pola=rentCarClass.getFields();
        for (Field field :pola) {
            System.out.println("Pola: "+field.getName());
            Object type=field.getType();
            System.out.println("Typ pola:"+type.toString());
            System.out.println("Wartosc pola: "+field.get(rentCar));
        }

        System.out.println("********");
        //Pola prywatne
        Field prywatnePole=rentCarClass.getDeclaredField("type");
        prywatnePole.setAccessible(true);
        System.out.println("Przed zmiana: "+prywatnePole.get(rentCar));
        prywatnePole.set(rentCar,"Pupa");
        System.out.println("Zmienione: "+rentCar.getType());


    }
}
