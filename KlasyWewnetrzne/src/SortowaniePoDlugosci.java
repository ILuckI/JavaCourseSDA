import java.util.*;

public class SortowaniePoDlugosci {
    public static void main(String[] args) {
        ArrayList<String> wyrazy = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String dane = sc.nextLine();
            wyrazy.add(dane);
        }

        Collections.sort(wyrazy, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String s : wyrazy) {
            System.out.println(s);
        }

    }
}
