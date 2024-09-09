package primeTest;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class falsePrimeNumber {
	
	@Test
    public void testforone() {
        assertFalse(primeNumber.isPrime(1));
    }

    @Test
    public void testfornegativeseven() {
        assertFalse(primeNumber.isPrime(-7));
    }
    @Test
    public void testforsix() {
    	assertFalse(primeNumber.isPrime(6));
    }
}
