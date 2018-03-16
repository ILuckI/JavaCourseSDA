public class tabliczkaMnozeniaTablica2d {
    public static void main(String[] args) {

        int [][] arr = new int[10][10];

        System.out.println("Tabliczka mnozenia napisana z uzyciem tablicy");
        for (int x =0; x < 10; x++){
            System.out.println("\n");
            for (int y=0; y < 10; y++){
                arr[x][y]=(x+1)*(y+1);
                System.out.print(arr[x][y]+"\t");
            }
        }

    }
}
