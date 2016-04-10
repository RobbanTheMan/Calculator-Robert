import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculationSub {

static calculator calculator;
	
	@Before
	public void setUp() throws Exception {
	
		calculator = new calculator();
		
	}

	@Test
	public void testPositive() {
		assertEquals("Det förväntade resultatet ska bli:5", 5 ,calculator.sub(10, 5), 0d);
		
	}
	@Test
	public void testNegative() {
		assertEquals("Det förväntade resultatet ska bli:-5", -5 ,calculator.sub(-15, -10), 0d);
		
	}
	@Test
	public void testDecimal() {
		assertEquals("Det förväntade resultatet ska bli:-1",-1,calculator.sub(1.5, 2.5), 0d);
	}
}
