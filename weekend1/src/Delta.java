public class Delta {
    public static void main(String[] args) {

        double a = 1.0, b = 2.0, c = 1.0;

        double delta = Math.pow(b, 2.0) - 4 * a * c;
        double powDelta = Math.sqrt(delta);

        double x = -b / (2 * a);
        double x1 = (-b - powDelta) / (2 * a);
        double x2 = (-b + powDelta) / (2 * a);

        if (delta > 0) {
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        else if (delta == 0) {
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Nie liczymy pierwiastkow (znajduja sie w liczbach zespolonych)");
        }
    }
}
