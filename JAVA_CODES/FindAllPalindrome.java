package JAVA_CODES;

/*
 * Given a range of numbers, find all the palindrome numbers in the range.

Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

Examples:

Example 1:
Input: min = 10 , max = 50
Output: 11 22 33 44 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

Example2:
Input: min = 100 , max = 150
Output: 101 111 121 131 141 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.
 */

public class FindAllPalindrome {
    public static void main(String[] args) {
        int start = 0, end = 1000;
        for (int i = start; i <= end; i++) {
            if (isPalindrom(i)) {
                System.out.print(i + " ");
            }
        }
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
