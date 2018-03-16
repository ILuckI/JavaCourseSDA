public class WhileZadanie1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int j = 0;
        while (j <= 20) {
            if (j%3 != 0) {
                System.out.println(j);}
                j++;
            }


        for (int k = 0; k <= 20; k++) {
            if (k % 2 == 0) {
                    System.out.println(k + " Liczba parzysta");
                }
                else  {
                    System.out.println(k + " Liczba nieparzysta");
                }

            }
        int z = 0;
        while (z <= 20){
            if (z % 2 == 0) {
                System.out.println(z + " Liczba parzysta");
            }
            z++;
            if (z % 2 != 0) {
                System.out.println(z + " Liczba nieparzysta");
            }
            z++;
        }

            int a = 1;
        do {
            if (a % 2 == 0)
            System.out.println(a + " Liczba parzysta");

            else
                System.out.println(a + " Liczba nieparzysta");

            a++;

        }while (a <= 20);


        }


        }
