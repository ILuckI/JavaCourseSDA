import java.util.*;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass1 = outerClass.instantiate();
        OuterClass.InnerClass innerClass2 = outerClass.new InnerClass();
        AnonymousInterface();

    }

    public static void AnonymousInterface() {
        Greetings pl = new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Witaj!");
            }
        };
        Greetings eng = new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Hallo!");
            }
        };
        Greetings de = new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Willkommen!");
            }
        };
        Greetings cz = new Greetings() {
            @Override
            public void sayHallo() {
                System.out.println("Ahoj!");
            }
        };

        pl.sayHallo();
        eng.sayHallo();
        de.sayHallo();
        cz.sayHallo();
    }



}
