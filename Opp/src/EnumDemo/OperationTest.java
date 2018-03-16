package EnumDemo;

public class OperationTest {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(10, 5));
        System.out.println(Operation.MINUS.calculate(10,5));
        System.out.println(Operation.MULT.calculate(10,5));
        System.out.println(Operation.DIV.calculate(10,5));
        System.out.println(Operation.MOD.calculate(10,5));
    }
}
