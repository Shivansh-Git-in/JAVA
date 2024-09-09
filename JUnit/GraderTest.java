package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {
	
	@Test
	public void nintyfivewillbeA() {
		Grader grader = new Grader();
		assertEquals('A',grader.Lettergrade(95));
	}
	@Test
	public void zerowillbeF() {
		Grader grader = new Grader();
		assertEquals('F',grader.Lettergrade(0));
	}
	@Test
	public void seventywillbeD() {
		Grader grader = new Grader();
		assertEquals('D',grader.Lettergrade(70));
	}
	@Test
	public void negative4willbeIllegalArgumentException() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class,
				() ->
			{grader.Lettergrade(-4);
			});
	}
}
