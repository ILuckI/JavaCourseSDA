package Zajecia2701.Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 1};

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // SWAP - zamiana miejscami 2 elementow tablicy
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
