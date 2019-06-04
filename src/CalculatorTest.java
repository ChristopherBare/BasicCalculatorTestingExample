import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test
	public void add() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.add(2,2), 0);
	}

	@Test
	public void sub() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.sub(5,3), 0);
	}

	@Test
	public void mult() {
		Calculator calc = new Calculator();
		assertEquals(6, calc.mult(2,3), 0);
	}

	@Test
	public void div() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.div(8,2), 0);
	}
}