import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorAdditionSpec {
    private double expected;
    private double a;
    private double b;

    public CalculatorAdditionSpec(double expected, double a, double b){
        this.expected = expected;
        this.a = a;
        this.b = b;
    }
    @Parameters
    public static Collection<Double []> addNumbers(){
        return Arrays.asList(new Double[][]{
                {1.0, 0.0, 1.0},
                {5.0, 2.0, 3.0},
                {10.0, 6.0, 4.0},
                {8.0, 5.0, 3.0}

        });

    }
    @Test
    public void additionTest(){
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.addition(a,b), 0.001);
    }

}
