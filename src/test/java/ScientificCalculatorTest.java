import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Scientific_Calculator.squareRoot(25), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Scientific_Calculator.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(2.302585, Scientific_Calculator.naturalLog(10), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Scientific_Calculator.power(2, 3), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        Scientific_Calculator.naturalLog(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Scientific_Calculator.factorial(-5);
    }
}
