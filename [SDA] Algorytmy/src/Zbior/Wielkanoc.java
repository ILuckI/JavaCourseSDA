import java.util.Scanner;

public class Wielkanoc {
    public static void main(String[] args) {

        int a, b, c, d, e, f, g, h, i, k, l, m, p;
        int userYear;
        int calculateDay;
        int calculateMonth;

        Scanner scr = new Scanner(System.in);
        System.out.println(": ");
        userYear = scr.nextInt();

        a = userYear % 19;
        b = Math.floorDiv(userYear,100);
        c = userYear % 100;
        d = Math.floorDiv(b,4);
        e = b / 4;
        f = Math.floorDiv((b+ 8),25);
        g = Math.floorDiv((b - f + 1),3);
        h = (19 * a + b - d - g + 15) % 30;
        i = Math.floorDiv(c,4);
        k = c % 4;
        l =  (32 + 2 *e+ 2 * i - h - k) % 7;
        m = Math.floorDiv((a+ 11 *h+ 22 *l),451);
        p = (h + 1 - 7 *m+ 114) % 31;
        calculateDay = p + 1;
        calculateMonth = Math.floorDiv((h + 1 -7 *m+ 114),31);
        if (calculateMonth == 4)
            System.out.println("Wielkanoc odbedzie sie w Kwietniu");
        else
            System.out.println("Wielkanoc odbedzie sie w Marcu");
    }
}
