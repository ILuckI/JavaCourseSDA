public class weekend3homework11 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();

        for (int j = 0; j <= 100; j++) {
            if (j % 5 == 0) {
                System.out.print(", " + j);
            }
        }
        System.out.println();
        for (int k = 0; k <= 100; k++) {
            if (k % 5 == 0 && k % 3 == 0) {
                System.out.print(", " + k);
            }
        // dodac tablice
        }
    }
}
