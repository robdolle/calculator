package robdolle.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

@Service
public class CalculatorTest {
	private CalculatorApplication calculator = new CalculatorApplication();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}
