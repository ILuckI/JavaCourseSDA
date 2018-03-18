package Zadanie5;

public class demo {

    public static void main(String[] args) {

        int[][] tab = new int[3][3];
        mirror(tab);


    }

    public static void mirror(int[][] tab){
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab.length -1 ; j++) {
                tab[i][j] += j;
                System.out.println(tab[i][j]);

            }

        }
    }
}
