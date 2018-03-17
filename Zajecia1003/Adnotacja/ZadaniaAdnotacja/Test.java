package Zajecia1003.Adnotacja.ZadaniaAdnotacja;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class klasaTestowa = Test.class;
        Method metodaZadnotacji=klasaTestowa.getDeclaredMethod("annotationTest");
    }
}
