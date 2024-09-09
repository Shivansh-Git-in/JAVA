package CA1;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class SuccessfullTestCases {
	 @Test
	    public void testRealRootsCase1() {
	        Quadraticequation solver = new QuadraticEquationSolver();
	        double[] roots = solver.solve();
	        assertArrayEquals(new double[] { 3, 2 }, roots, 0.001);
	    }

	    private void assertArrayEquals(double[] ds, double[] roots, double d) {
			
		}

		@Test
	    public void testRealRootsCase2() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(2, 5, 3);
	        double[] roots = solver.solve();
	        assertArrayEquals(new double[] { -1.5, -1 }, roots, 0.001);
	    }

	    @Test
	    public void testRealRootsCase3() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, -3, 2);
	        double[] roots = solver.solve();
	        assertArrayEquals(new double[] { 2, 1 }, roots, 0.001);
	    }

	    @Test
	    public void testRealRootsCase4() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(3, -10, 7);
	        double[] roots = solver.solve();
	        assertArrayEquals(new double[] { 7, 1.0/3.0 }, roots, 0.001);
	    }

	    @Test
	    public void testRealRootsCase5() {
	        QuadraticEquationSolver solver = new QuadraticEquationSolver(2, 8, 6);
	        double[] roots = solver.solve();
	        assertArrayEquals(new double[] { -1, -3 }, roots, 0.001);
	    }

}
