import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculationAdd {

	static calculator calculator;
	
	@Before
	public void setUp() throws Exception {
	
		calculator = new calculator();
		
	}

	@Test
	public void testPositive() {
		assertEquals(10,calculator.add(5, 5), 0d);
		
	}
	@Test
	public void testNegative() {
		assertEquals(-10,calculator.add(-5, -5), 0d);
		
	}
	@Test
	public void testDecimal() {
		assertEquals(11,calculator.add(5.5, 5.5), 0d);
	}
}

