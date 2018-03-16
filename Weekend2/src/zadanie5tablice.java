public class zadanie5tablice {
    public static void main(String[] args) {
        int macierz[][] = new int[10][10];
        int suma = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("\n");
            for (int y = 0; y < 10; y++) {
                macierz[x][y] = (9-x==y) ? x : 0;
                System.out.print(macierz[x][y] + "\t");
                }
            System.out.printf("Suma: %d", suma);
        }

    }
}
