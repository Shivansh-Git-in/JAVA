package junittest;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Ignore;

public class LoginpageTest {
    
    @Test
    public void testUsernameNotStartingWithNumericOrSpecialCharOrSpace() {
        Loginpage loginPage = new Loginpage();
        assertFalse(loginPage.validateUsername("1username"));
        assertFalse(loginPage.validateUsername("@username"));
        assertFalse(loginPage.validateUsername(" username"));
    }
    
    @Test
    public void testUsernameStartingWithUnderscore() {
        Loginpage loginPage = new Loginpage();
        assertTrue(loginPage.validateUsername("_username"));
    }
    
    @Test
    public void testMatchingUidAndPwd() {
        Loginpage loginPage = new Loginpage();
        assertTrue(loginPage.validateCredentials("username", "password"));
    }
    
    @Test
    public void testNotMatchingUidAndPwd() {
        Loginpage loginPage = new Loginpage();
        assertFalse(loginPage.validateCredentials("username", "wrongpassword"));
    }
    @Ignore
    @Test
    public void testPasswordMinimumLength() {
        Loginpage loginPage = new Loginpage();
        assertFalse(loginPage.validatePassword("passwrd"));
        assertTrue(loginPage.validatePassword("password1"));
    }
    
    @Test
    public void testPasswordWithSpecialCharAndNumeric() {
        Loginpage loginPage = new Loginpage();
        assertFalse(loginPage.validatePassword("password"));
        assertFalse(loginPage.validatePassword("password@"));
        assertFalse(loginPage.validatePassword("password123"));
        assertTrue(loginPage.validatePassword("password@123"));
    }
    
}
