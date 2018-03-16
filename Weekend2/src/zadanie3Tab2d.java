public class zadanie3Tab2d {
    public static void main(String[] args) {
        double[][] array = new double[3][3];

        double iterator = 1;
        for (int x =0; x < 3; x++){
            for (int y=0; y < 3; y++){
                array[x][y]= Math.pow(iterator,2.0);
                iterator++;
                System.out.printf("array[%d][%d] = %f\n", x, y, array[x][y]);
            }
        }
    }
}
