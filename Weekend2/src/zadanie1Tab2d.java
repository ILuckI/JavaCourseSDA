public class zadanie1Tab2d {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int x = 0; x < 3; x++) {
            System.out.println("\n");
            for (int y = 0; y < 3; y++) {
                if (y == 2)
                    array[x][y] = 1;
                else
                    array[x][y] = 0;
                System.out.print(array[x][y] + "\t");
            }
        }
    }
}
