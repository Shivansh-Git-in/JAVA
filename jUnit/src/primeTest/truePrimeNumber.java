package primeTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class truePrimeNumber {

    @Test
    public void testforseven() {
        assertTrue(primeNumber.isPrime(7));
    }

    @Test
    public void testforthirteen(){
        assertTrue(primeNumber.isPrime(13));
    }
}
