package WzorzecSingleton.SingletonLeniwy;

public class demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.pobierzInstancje();
        singleton.wyswietlKomunikat();

    }
}
