package Zajecia2701;

// algorytm n kwadrat
public class SitoEratostenesa {
    public static void main(String[] args) {

        boolean [] array = new boolean[10000];

        for (int i = 1; i <array.length ; i++) {
                array[i] = true;
        }
        for (int i = 2; i <array.length ; i++) {
           if (array[i]){
               for (int j = i + i; j <array.length ; j += i) {
                  array[j] = false;
               }
           }
           else continue;
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i]){
                System.out.println(i);
            }
        }
    }
}
