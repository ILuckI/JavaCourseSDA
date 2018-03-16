public class tablicaWielowymiarowa {
    public static void main(String[] args) {
        int tab [][] = new int[4][];

        tab[0] = new int[4];
        tab[1] = new int[2];
        tab[2] = new int[1];
        tab[3] = new int[3];

        int counter = 1;
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                tab[i][j]= counter++;
                System.out.printf("array[%d][%d] = %d\n", i, j, tab[i][j]);
            }

        }
    }
}
