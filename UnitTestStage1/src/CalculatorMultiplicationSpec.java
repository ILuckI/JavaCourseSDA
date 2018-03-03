import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorMultiplicationSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorMultiplicationSpec(double expected, double a, double b){
        this.expected = expected;
        this.a = a;
        this.b = b;
    }
    @Parameters
    public static Collection<Double []> multiplicationNumbers(){
        return Arrays.asList(new Double[][]{
                {10.0, 5.0, 2.0},
                {50.0, 10.0, 5.0},
                {100.0, 10.0, 10.0},
                {1.0, 1.0, 1.0},
                {0.0, 1.0, 0.0}

        });

    }
    @Test
    public void multiplicationTest(){
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.multiplication(a,b), 0.001);
    }

}
