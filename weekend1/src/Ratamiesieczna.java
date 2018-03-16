public class Ratamiesieczna {
    public static void main(String[] args) {
        double cenaTowaru = 3456.0;
        int liczbaRat = 24;

        if (liczbaRat < 6 || liczbaRat > 48 || cenaTowaru < 100 || cenaTowaru > 10000) {
            System.out.println("Wprowadzone zle dane");
        } else {
            double opocentowanie = 0;
            if (liczbaRat >= 6 && liczbaRat <= 12)
                opocentowanie = 0.025;
            else if (liczbaRat > 12 && liczbaRat <= 24)
                opocentowanie = 0.05;
            else
                opocentowanie = 0.1;

            double q = (1 + opocentowanie / 12);
            double rata = (cenaTowaru * Math.pow(q, liczbaRat) * (q - 1)) / (Math.pow(q, liczbaRat) - 1);
            System.out.println("Rata wynosi: " + rata);
        }
    }
}
