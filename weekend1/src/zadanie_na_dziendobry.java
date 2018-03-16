public class zadanie_na_dziendobry {
    public static void main(String[] args) {

        int a = 6, b = 2, c = 2;

        if (a >= b) {
            if (b <= c) {
                System.out.println("A >= B <=C");
            } else {
                System.out.println("A >= B => C");
            }
        } else {
            System.out.println("A <= B => C");
            if (b < c) {
                System.out.println("A <= B <= C");
            }
        }


    }
}
