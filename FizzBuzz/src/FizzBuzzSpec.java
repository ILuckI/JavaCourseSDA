import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FizzBuzzSpec {
    FizzBuzz fizzBuzz;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        fizzBuzz = new FizzBuzz();
    }

}
