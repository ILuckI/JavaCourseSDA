package PierwszePodejscie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        try {
            // Pobranie definicji
            Class<?> definicjaPies = Class.forName("PierwszePodejscie.Pies");
            // Nowa instancja
            Pies refleksyjnyBurek = (Pies) definicjaPies.newInstance();
            // Tablica typow wejsciowych do metody setImie
            Class[] arguentyTypuWejsciowe = {String.class};
            Method metodaSetImieWZmiennej = definicjaPies.getDeclaredMethod("setImie", arguentyTypuWejsciowe);
            // Przygotowanie argumentow wejsciowych
            Object[] arguentyWejsciowe = {"Burek"};
            // Uruchomienie
            metodaSetImieWZmiennej.invoke(refleksyjnyBurek, arguentyWejsciowe);
            // Dobranie sie do metody statycznej
            Method metodaStatycznaSzczekaj = definicjaPies.getMethod("szczekaj");
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
