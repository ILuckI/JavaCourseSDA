public class Reszta_z_dzielenia {
    public static void main(String[] args) {

        int a = 5, b = 10;
        int modulo = a%b;

        if (modulo == 0)
        {
            System.out.println("Brak reszty z dzielenia");
        }
        else {
            System.out.println("Reszta z dzienenia wynosi: " + modulo);
        }
    }
}

