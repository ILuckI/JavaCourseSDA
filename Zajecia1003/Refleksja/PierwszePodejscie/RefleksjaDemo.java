package Zajecia1003.Refleksja.PierwszePodejscie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefleksjaDemo {
    public static void main(String[] args) {
        try {
            Class<?>definicjaPies=Class.forName("Zajecia1003.Refleksja.PierwszePodejscie.Pies");

            //Nowa instancja klasy
            Pies refleksyjnyBurek=(Pies) definicjaPies.newInstance();

            //Tablice typow wejsciowych typu class
            Class[] argumentyTypuWejsciowe={String.class};

            //Zapisujemy
            Method metodaaSetImieZmiennej=definicjaPies.getDeclaredMethod("setImie",argumentyTypuWejsciowe);

            //Przygotowanie argumentow wejsciowych
            Object[] argumentyWejsciowe= {"Burek"};

            //Uruchomienie
            metodaaSetImieZmiennej.invoke(refleksyjnyBurek,argumentyWejsciowe);

            System.out.println(refleksyjnyBurek.getImie());

            //Dobranie sie do metody statycznej
            Method metodaStatycznaSzczekaj=definicjaPies.getMethod("Szczekaj");
            metodaStatycznaSzczekaj.invoke(null);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
