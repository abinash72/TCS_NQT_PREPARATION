package JAVA_CODES;

/*
 * Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples
Example 1:
Input:N = 153
Output:True
Explanation: 13+53+33 = 1 + 125 + 27 = 153
Example 2:
Input:N = 371
Output: True
Explanation: 33+53+13 = 27 + 343 + 1 = 371
 */

public class IsArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmStrong(n));
    }
    
    public static boolean isArmStrong(int num) {
        int x = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res += Math.pow(rem, 3);
            num /= 10;
        }

        if (res == x) {
            return true;
        } else {
            return false;
        }
    }
}
