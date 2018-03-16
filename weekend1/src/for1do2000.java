public class for1do2000 {
    public static void main(String[] args) {

        int suma = 0;
       // int suma2 =0;

        for (int i = 1; i <= 2000; i++) {
            suma = (i%2==0) ? suma+i : suma;


        }
        System.out.println(suma);

    }
}
