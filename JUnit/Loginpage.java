package junittest;

public class Loginpage {

    // Username Validation
    public boolean validateUsername(String username) {
        if (username.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }
        return false;
    }
    // Password Validation
    public boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        } else if (!password.matches(".*\\d.*")) {
            return false;
        } else if (!password.matches(".*[@#$%&+=].*")) {
            return false;
        }
        return true;
    }
 // Credentials Validation
    public boolean validateCredentials(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            return true;
        }
        return false;
    }
}