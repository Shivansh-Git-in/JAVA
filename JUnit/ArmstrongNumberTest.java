package junittest;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArmstrongNumberTest {

    @Test
    public void testIsArmstrongTrue() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(153);
        assertTrue(result);
    }

    @Test
    public void testIsArmstrongFalse() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(154);
        assertFalse(result);
    }

    @Test
    public void testIsArmstrongZeroTrue() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(0);
        assertTrue(result);
    }

    @Test
    public void testIsArmstrongNegativeFalse() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(-153);
        assertFalse(result);
    }

    @Test
    public void testIsArmstrongLargeTrue() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(9474);
        assertTrue(result);
    }

    @Test
    public void testIsArmstrongLargeFalse() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(9475);
        assertFalse(result);
    }

    @Test
    public void testIsArmstrongLeadingZerosFalse() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(00153);
        assertFalse(result);
    }

    @Test
    public void testIsArmstrongDecimalFalse() {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        boolean result = armstrong.isArmstrong(1.53);
        assertFalse(result);
    }

}