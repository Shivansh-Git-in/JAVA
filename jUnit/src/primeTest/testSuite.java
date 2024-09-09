package primeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        truePrimeNumber.class,
        falsePrimeNumber.class
})
public class testSuite {
    // This class doesn't have any code.
    // It serves as a container for the test classes.
}