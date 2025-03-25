package JAVA_CODES;

/*
 * Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Examples
Example 1:
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
Example 2:
Input:N = 7789
Output: Not Palindrome
Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
 */

public class IsNumPalindrom {
    public static void main(String[] args) {
        int num = 13321;
        System.out.println(isPalindrom(num));
    }

    public static boolean isPalindrom(int n) {
        int x = n;
        int rev =0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        
        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }
}
