public class zadanie3tablice {
    public static void main(String[] args) {

        int tab[][][] = new int[10][10][10];
        System.out.println("Tabliczka mnozenia napisana z uzyciem tablicy");
        for (int x = 0; x < 10; x++) {
             for (int y = 0; y < 10; y++) {
                 for (int z = 0; z < 10; z++) {
                    tab[x][y][z] = (x+1) * (y+1) * (z+1);
                    System.out.printf("array[%d][%d][%d] = %d\n", x, y, z, tab[x][y][z]);
                }
            }
        }

    }
}