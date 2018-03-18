package Zadanie6;

public class demo {

    private static int[][] tab = new int[5][5];

    public static void main(String[] args) {



    }

    public static int[][] subTab(int[][] tab, int x, int y, int sizeX, int sizeY) {

        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[j].length; j++) {
                tab[i][j] = sum;

                sum = sum + 2;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        int add = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = tab[i].length / 2 + 1; j < tab[i].length; j++) {
                for (int k = 0; k < tab[i].length / 2; k = k++) {
                    tab[i][j] = tab[i][k];
                }
            }
        }

        System.out.println();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }
        return tab;
    }
}


