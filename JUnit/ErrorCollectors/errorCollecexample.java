package errorCollections;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class errorCollecexample {
	@Rule
	public ErrorCollector collec=new ErrorCollector();
	
	@Test
	public void example() {
		collec.addError(new Throwable("There is an error on line 1"));
		collec.addError(new Throwable("There is an error on line 2"));
		System.out.println("Hello");
		try {
			Assert.assertTrue("A"=="B");
		}catch(Throwable t) {
			collec.addError(t);
		}
		System.out.println("world");
	}

}
