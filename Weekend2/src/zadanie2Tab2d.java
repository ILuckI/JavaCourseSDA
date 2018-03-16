public class zadanie2Tab2d {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int counter = 1;
        for (int x =0; x < 3; x++){
            System.out.println("\n");
            for (int y=0; y < 3; y++){
                array[x][y]= counter++;
                System.out.print(array[x][y]+"\t");
            }
        }
    }
}
