package Zajecia1003.Adnotacja;


import Zajecia1003.Adnotacja.ZadaniaAdnotacja.MyDocumentation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class klasaTestowa=Test.class;
        Method metodaZadnotacja=klasaTestowa.getDeclaredMethod("annotationTest");
        metodaZadnotacja.getAnnotation(FirstAdnotation.class);
        FirstAdnotation adnotacja=metodaZadnotacja.getAnnotation(FirstAdnotation.class);
        System.out.println();
        Method adnotacjaDruga=klasaTestowa.getDeclaredMethod("secondAnnotation");
        MyDocumentation adnotacjaDlaDrugiejMetody=adnotacjaDruga.getAnnotation(MyDocumentation.class);
        System.out.println(adnotacjaDlaDrugiejMetody.author());
        System.out.println(adnotacjaDlaDrugiejMetody.comment());

    }

    @FirstAdnotation(id = "1", wiek = 12, test = false)

    public void annotationTest() {

    }
    @MyDocumentation(author = "Test",comment = "Test2")
    public void secondAnnotation(){

    }
}
