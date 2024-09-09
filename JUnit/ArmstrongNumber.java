package junittest;

public class ArmstrongNumber {

    public boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return num == sum;
    }

    public boolean isArmstrong(double d) {
        return false;
    }
}