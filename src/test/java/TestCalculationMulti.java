import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculationMulti {

static calculator calculator;
	
	@Before
	public void setUp() throws Exception {
	
		calculator = new calculator();
		
	}

	@Test
	public void testPositive() {
		assertEquals("Det förväntade resultatet ska bli:81", 81 ,calculator.multi(9, 9), 0d);
		
	}
	@Test
	public void testNegative() {
		assertEquals("Det förväntade resultatet ska bli:30",30,calculator.multi(-6, -5), 0d);
		
	}
	@Test
	public void testDecimal() {
		assertEquals("Det förväntade resultatet ska bli:6.5",6.51525,calculator.multi(2.55, 2.555), 0d);
	}
}
