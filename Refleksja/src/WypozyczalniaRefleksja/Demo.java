package WypozyczalniaRefleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class rental = RentCar.class;
        System.out.print("Nazwa klasy i paczki: " + rental.getName() + "\n");
        System.out.print("Nazwa klasy: " + rental.getSimpleName() + "\n");
        System.out.print("Nazwa klasy canonial: " + rental.getCanonicalName()+ "\n");
        System.out.print("Nazwa paczki: " + rental.getPackage() + "\n");

        // Pobieramy publiczne konstruktory
        Constructor[] constructors = rental.getConstructors();
        System.out.println("Constructors are:" + Arrays.toString(constructors));
        Constructor constructor = rental.getConstructor(Integer.TYPE);
        // Tworzymy Obiekt na podstawie konstruktora
        RentCar rent = (RentCar) constructor.newInstance(123);
        // Pobieranie metod
        Method[] metody = rental.getMethods();
        for (Method method : metody) {
            System.out.println(method.getName());
        }
        // Pobieranie konkretnej metody po nazwie
        Method metoda = rental.getDeclaredMethod("computerRentalCost", int.class);
        System.out.println(metoda);
        // Uruchomienie metody
        metoda.invoke(rent, 4);
        // pobieranie typow wejsciowych metody
        Class[] typyArgumentow = metoda.getParameterTypes();
        // pobieranie typow zwracanych
        Class zwracanyTyp = metoda.getReturnType();
        System.out.println(zwracanyTyp);

        // Pola
        Field[] pola = rental.getFields();
        for (Field singleField : pola) {
            System.out.println(singleField.getName());
            Object type = singleField.getType();
            System.out.println("Typ pola: " + type.toString());
            System.out.println("Wartosc pola: " + singleField.get(rent));
        }

        // Prywatne pola
        Field prywatnePole = rental.getDeclaredField("type");
        prywatnePole.setAccessible(true);
        System.out.println(prywatnePole.get(rent));
        prywatnePole.set(rent,"Dupa");
        System.out.println(prywatnePole.get(rent));
    }
}
