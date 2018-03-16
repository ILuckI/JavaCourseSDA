public class zadanie6tablice {
    public static void main(String[] args) {
        int tab[][] = new int[10][10];
        for (int i = 0; i <10 ; i++) {
            System.out.println("\n");
            for (int j = 0; j <10 ; j++) {
                tab[i][j] = (j==0) ? i : 0;
                if(j==1){
                    tab[i][j] = i * i;

                }
                System.out.print(tab[i][j] + "\t");
            }

        }
    }
}
