package errorCollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(errorCollecexample.class);

        // Display test results
        System.out.println("Number of tests run: " + result.getRunCount());
        System.out.println("Number of tests failed: " + result.getFailureCount());

        for (Failure failure : result.getFailures()) {
            System.out.println("Failure: " + failure.toString());
        }

        System.out.println("All tests passed: " + result.wasSuccessful());
    }
}
