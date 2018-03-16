public class zadanie4tablice {
    public static void main(String[] args) {
        int macierz[][] = new int[10][10];


        for (int x = 0; x < 10; x++) {
            System.out.println("\n");
            for (int y = 0; y < 10; y++) {
                macierz[x][y] = (x == y) ? 1 : 0;
                System.out.print(macierz[x][y] + "\t");

            }
            int suma = 0;
            for (int i = 0; i < macierz.length ; i++) {
                suma += macierz[i][i];
            }
            System.out.printf("Suma: %d", suma);
        }


    }
}


