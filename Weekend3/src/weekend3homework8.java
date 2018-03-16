import java.util.Scanner;

public class weekend3homework8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku a szesciokata foremnego:  ");
        int usera = scr.nextInt();
        System.out.println("Pole powierzchni wynosi: " + area(usera));
        System.out.println("Obwod: " + circuit(usera));
        System.out.println("Dluzsza przekatna: " + diagonalmin(usera));
        System.out.println("Krotsza przekata: " + diagonalmax(usera));
        System.out.printf("Promien wpianego okregu: %.2f ",circle(usera));

    }
    public static int area (int x){ // pole powierzchni
        int area = x * x;
        return area;
    }
    public static int circuit (int x){ //obwod
       int circuit = 6 * x;
        return circuit;
    }
    public static double diagonalmax (int x) { // dluzsza przekatna
        double diagonalmax = x * Math.pow(3,0);
        return diagonalmax;
    }
    public static int diagonalmin (int x) { //  krotsza przekatna
        int diagonalmin = 2 * x;
        return diagonalmin;
    }
    public static double circle (int x) { // promien wpisanego okregu
        double circle = x * Math.sqrt(3);
        return circle;
    }
}
