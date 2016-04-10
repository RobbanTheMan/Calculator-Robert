import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculationDiv {

static calculator calculator;
	
	@Before
	public void setUp() throws Exception {
	
		calculator = new calculator();
		
	}

	@Test
	public void testPositive() {
		assertEquals("Det förväntade resultatet ska bli:2", 2 ,calculator.div(6, 3), 0d);
		
	}
	@Test
	public void testNegative() {
		assertEquals("Det förväntade resultatet ska bli:1",1,calculator.div(-8, -8), 0d);
		
	}
	@Test
	public void testDecimal() {
		assertEquals("Det förväntade resultatet ska bli:1.9",2,calculator.div(10.5, 5.25), 0d);
	}
}
