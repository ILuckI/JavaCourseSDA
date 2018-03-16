public class switch2 {
    public static void main(String[] args) {

        int a = 7;

        switch (a) {
            case 1:
            case 4:
            case 8:
                System.out.println("zmienna ma wartosc 1,4,8");
                break;
            case 2:
            case 3:
            case 7:
                System.out.println("zmienna ma wartosc 2,3,7");
                break;
            default:
                System.out.println("Wszystkie inne przypadki");

        }
    }
}
