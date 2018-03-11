package Adnotacja;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {


        Class testingClass = Test.class;
        Method metodaZAdnotacja = testingClass.getDeclaredMethod("annotationTest");
        FirstAnnotation adnotacja = metodaZAdnotacja.getAnnotation(FirstAnnotation.class);

        Class myDockTest = Test.class;
        Method StopSpamAllPc = testingClass.getDeclaredMethod("docTest");
        MyDocumentation my = StopSpamAllPc.getAnnotation(MyDocumentation.class);

        Class defaultValue = Test.class;
        Method getDeflautValue = testingClass.getDeclaredMethod("adress");
       // DefaultAdress def =  getDeflautValue.getDeclaredAnnotations(DefaultAdress.class);

    }

    @FirstAnnotation(id="1", wiek = 12)
    public void annotationTest(){

    }
    @MyDocumentation(author = "Lukas", comment = "Lala lalaaa")
    public void docTest(){}

    @DefaultAdress()
    public void adress(){}

}
