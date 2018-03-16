public class TotoLotek {
    public static void main(String[] args) {

        System.out.println("6 Losowych liczb z zakresu 1 - 49\n");
        for (int i = 0; i < 6; i++) {
            System.out.println((int) (Math.random() * 48) + 1);
        }
    }
}
