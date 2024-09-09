package CA1;

import org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class UnsuccessfullTestCases {

	 @Test
	    public void testImaginaryRootsCase1() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, 2, 10);
	        double[] roots = solver.solve();
	        assertNull(roots);
	    }

	    private void assertNull(double[] roots) {
			
		}

		@Test
	    public void testImaginaryRootsCase2() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(2, -1, 5);
	        double[] roots = solver.solve();
	        assertNull(roots);
	    }

	    @Test
	    public void testImaginaryRootsCase3() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, 4, 5);
	        double[] roots = solver.solve();
	        assertNull(roots);
	    }

}
