package WzorzecSingleton.SingletonIntelliJ;

public class DuzaKlana {
    private static DuzaKlana ourInstance = new DuzaKlana();

    public static DuzaKlana getInstance() {
        return ourInstance;
    }

    private DuzaKlana() {
    }
}
