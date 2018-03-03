import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class CalculatorevenNumberSpec {
    private boolean expected;
    private double a;

    public CalculatorevenNumberSpec(boolean expected, double a){
        this.expected = expected;
        this.a = a;

    }
    @Parameters
    public static Collection<Object []> evenNumbers(){
        return Arrays.asList(new Object[][]{
                {true, 10.0},
                {true, 2.0},
                {true, 100.0},
                {true, -50.0},
        });

    }
    @Test
    public void evenNumberTest(){
        // create new instance
        Calculator calculator = new Calculator();
        // standard assert test
        assertEquals(expected,calculator.evenNumber(a));
        // assert true test
        assertTrue(calculator.evenNumber(a));
    }

}
