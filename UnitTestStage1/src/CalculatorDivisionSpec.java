import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorDivisionSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorDivisionSpec(double expected, double a, double b){
        this.expected = expected;
        this.a = a;
        this.b = b;
    }
    @Parameters
    public static Collection<Double []> divisionNumbers(){
        return Arrays.asList(new Double[][]{
                {2.0, 10.0, 5.0},
                {3.0, 9.0, 3.0},
                {100.0, 1000.0, 10.0},
                {1.0, 1.0, 1.0},

        });

    }
    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.division(a,b), 0.001);
    }

}
