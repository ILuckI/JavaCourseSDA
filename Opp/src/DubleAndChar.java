public class DubleAndChar {
    double a;
    char c;


    public DubleAndChar(){
        a = 99;
        c = 'U';
    }
    public DubleAndChar(double x) {
        a = x;
    }

    public DubleAndChar(char x) {
        c = x;
    }

    public DubleAndChar(double x, char y) {
        this(x);
        this.c = y;
    }

    public DubleAndChar(char x, double y) {
        this(x);
        this.a = y;
    }

    public double setA(double x) {
        this.a = x;
        return x;
    }

    public char setChar(char x) {
        this.c = x;
        return x;
    }

    public double getA() {
        return a;
    }

    public char getC() {
        return c;
    }

    public String toString() {
        return ("Doble = " + a + " Char: = " + c);
    }
}
