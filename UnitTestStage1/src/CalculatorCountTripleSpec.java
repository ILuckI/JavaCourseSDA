import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorCountTripleSpec {
    private int expected;
    private String text;

    public CalculatorCountTripleSpec(int expected, String text){
        this.expected = expected;
        this.text = text;
    }
    @Parameters
    public static Collection<Object []> countTripleNumbers(){
        return Arrays.asList(new Object[][]{
                {1, "abcXXXabc"},
                {3, "xxxabyyyycd"},
                {0, "a"}
        });

    }
    @Test
    public void additionTest(){
        Calculator calculator = new Calculator();
        assertEquals(expected,calculator.countTriple(text));
    }

}
