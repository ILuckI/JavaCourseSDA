package WzorzecStrategia.Sortowanie;

public class Zliczenie implements SortowanieInterface {

    @Override
    public int[] sort(int[] toSort) {

        int max = -1;
        //Wyszukanie maxa
        for (int i = 0; i < toSort.length; i++) {
            if (max < toSort[i])
                max = toSort[i];
        }

        int[] countingTable = new int[max + 1];
        // zliczanie
        for (int i = 0; i < toSort.length; i++)
            countingTable[toSort[i]]++;

        // sortowanie
        for (int i = 0; i < countingTable.length; i++) {
            while (countingTable[i] > 0) {
                System.out.print(i + " ");
                countingTable[i]--;
            }
        }
        return toSort;

    }
}
