public class newMain2 {
    public static void main(String[] args) {

        intStorage liczba = new intStorage(10);
        intStorage liczba1 = new intStorage();
        System.out.println(liczba);
        System.out.println(liczba1);

        DubleAndChar noArg = new DubleAndChar();
        System.out.println(noArg);
        DubleAndChar doubleA = new DubleAndChar(10.0);
        System.out.println(doubleA);
        DubleAndChar doubleAC = new DubleAndChar(10,'c');
        System.out.println(doubleAC);
        DubleAndChar charC = new DubleAndChar('c');
        System.out.println(charC);
        DubleAndChar charCA = new DubleAndChar('c',10);
        System.out.println(charCA);
    }
}
