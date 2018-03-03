package WzorzecStrategia.Sortowanie;

public class Babelkowe implements SortowanieInterface {

    @Override
    public int[] sort(int[] array) {
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



        return array;
    }
}
