import org.junit.Test;

// importuje wszystkie metody statyczne JUnit
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void additionShouldReturnFour() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.addition(3.0, 1.0), 5);

    }

    @Test
    public void additionShouldReturnZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.addition(0.0, 0.0), 1);
    }

    @Test
    public void additionShouldReturOne() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.addition(0, 1), 2);
    }

    @Test
    public void subtractionShouldReturnFour() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.subtraction(8.0, 4.0), 5);

    }

    @Test
    public void subtractionShouldReturnZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.subtraction(0.0, 0.0), 1);
    }

    @Test
    public void multiplicationShouldReturnFour() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.multiplication(1.0, 4.0), 5);

    }

    @Test
    public void divisionShouldReturnFour() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.division(8.0, 2.0), 5);

    }


}