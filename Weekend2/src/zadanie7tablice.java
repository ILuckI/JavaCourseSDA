public class zadanie7tablice {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];

        for (int i = 0; i <10 ; i++) {
            System.out.println("\n");
            for (int j = 0; j <10  ; j++) {
                a[i][j]=i++;
                System.out.print(a[i][j] + "\t");

            }
        }


    }
}
