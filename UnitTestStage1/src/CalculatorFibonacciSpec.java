import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorFibonacciSpec {
    private int expected;
    private int a;

    public CalculatorFibonacciSpec(int expected, int a) {
        this.expected = expected;
        this.a = a;
    }

    @Parameters
    public static Collection<Integer[]> fibonacciNumbers() {
        return Arrays.asList(new Integer[][]{
                {34, 9},
                {2584, 18},
                {55, 10},
                {1, 1}
        });
    }

    @Test
    public void fibonacciTest() {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.fibonacci(a), 0.001);
    }

}
