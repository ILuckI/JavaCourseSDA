package WzorzecSingleton.SingletonWatkowy2;

public class Singleton {
    private static Singleton unikalnaInstancja = new Singleton();

    private Singleton (){}

    public static Singleton getUnikalnaInstancja() {
        return unikalnaInstancja;
    }
}
