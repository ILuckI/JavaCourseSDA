package WyrazeniaLambda;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.UnaryOperator;

public class przyklad {

    public static void main(String[] args) {
        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };
        System.out.println(isOddAnonymous.check(23));

        Checker<Integer> isOddAnonymousLambda = x -> x % 2 != 0;
        System.out.println(isOddAnonymousLambda.check(23));

        UnaryOperator<Integer> power = x -> x * x;
        UnaryOperator<Integer> adding = x -> x + 20;
        Dzialania add = (x,y) -> x + y;
        Dzialania modulo = (x,y) -> x % y;
        Dzialania minus = (x,y) -> x - y;

        System.out.println(add.calculate(10,10));
        System.out.println(modulo.calculate(10,10));

        ParzystaAlboNieparzysta parzystaAlboNieparzysta = new ParzystaAlboNieparzysta();
        BooleanSupplier isReturnTrue = parzystaAlboNieparzysta::trueIf;
        BooleanSupplier isReturnFalse = parzystaAlboNieparzysta::falseIf;
        demo(isReturnFalse);
        demo(isReturnTrue);


    }
    public static void demo (BooleanSupplier logic){
        System.out.println(logic.getAsBoolean());
    }



}

