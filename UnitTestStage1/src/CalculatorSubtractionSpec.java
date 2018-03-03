import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubtractionSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorSubtractionSpec(double expected, double a, double b){
        this.expected = expected;
        this.a = a;
        this.b = b;
    }
    @Parameters
    public static Collection<Double []> minusNumbers(){
        return Arrays.asList(new Double[][]{
                {5.0, 15.0, 10.0},
                {5.0, 8.0, 3.0},
                {5.0, 9.0, 4.0},
                {0.0, 1.0, 1.0}

        });

    }
    @Test
    public void subtractionTest(){
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.subtraction(a,b), 0.001);
    }

}
