package Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                try {
                    array[i][j] = 1;
                } catch (ArrayIndexOutOfBoundsException ex) {
                    // ex.printStackTrace();
                    System.out.printf("i:%d j:%d\n", i, j);
                }
            }

        }
    }
}
