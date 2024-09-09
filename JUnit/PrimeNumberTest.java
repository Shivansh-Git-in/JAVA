package junittest;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

public class PrimeNumberTest {
	@Before public void beforetestcases(){
			System.out.println("Running before");
		}
	
  @Test
  public void testIsPrimeWithPrimeNumbers() {
    assertTrue(PrimeNumber.isPrime(2));
    assertTrue(PrimeNumber.isPrime(3));
    assertTrue(PrimeNumber.isPrime(5));
    assertTrue(PrimeNumber.isPrime(7));
    assertTrue(PrimeNumber.isPrime(11));
  }
 @Ignore
 @Test
  public void testIsPrimeWithNonPrimeNumbers() {
    assertFalse(PrimeNumber.isPrime(1));
    assertFalse(PrimeNumber.isPrime(4));
    assertFalse(PrimeNumber.isPrime(6));
    assertFalse(PrimeNumber.isPrime(8));
    assertFalse(PrimeNumber.isPrime(9));
  }

  @Test
  public void testIsPrimeWithZeroAndNegativeNumbers() {
    assertFalse(PrimeNumber.isPrime(0));
    assertFalse(PrimeNumber.isPrime(-2));
    assertFalse(PrimeNumber.isPrime(-7));
  }
  @After public void aftertestcases() {
	  System.out.println("Running After");
  }
}
