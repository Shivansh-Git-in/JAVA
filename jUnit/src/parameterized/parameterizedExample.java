package parameterized;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class parameterizedExample{
	
	private int num1;
	private int num2;
	private int expected;
	private Arithematic arithematic;
	
	public parameterizedExample(int num1, int num2, int expected) {
		super();
		this.num1=num1;
		this.num2=num2;
		this.expected=expected;
	}
	@Before
	public void initialize() {
		arithematic=new Arithematic();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{100,200,300},{120,120,240}});
	}
	@Test
	public void test() {
		System.out.println("Sum : "+expected);
		assertEquals(expected,arithematic.sum(num1,num2));
	}
}