package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplecalculatorTest {
	@Test
	public void twoplustwoequalsfour(){
		Simplecalculator calculator = new Simplecalculator();
		assertEquals(4,calculator.add(2, 2));
	}
	@Test
	public void fiveplussixequalseleven(){
		Simplecalculator calculator = new Simplecalculator();
		assertEquals(11,calculator.add(5, 6));	
	}
}
