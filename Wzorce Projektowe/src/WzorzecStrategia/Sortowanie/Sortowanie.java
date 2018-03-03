package WzorzecStrategia.Sortowanie;

public class Sortowanie {
    protected SortowanieInterface sortowanieInterface;

    public Sortowanie() {
        this.sortowanieInterface = new Babelkowe();
    }

    public void wykonajSort(int[] input) {
        sortowanieInterface.sort(input);
    }

    public void setSortowanieInterface(SortowanieInterface sortowanieInterface) {
        this.sortowanieInterface = sortowanieInterface;
    }
}
