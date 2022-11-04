package robdolle.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;


@SpringBootTest
class CalculatorApplicationTests {
	private CalculatorApplication calculator = new CalculatorApplication();
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
