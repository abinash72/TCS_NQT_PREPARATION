package JAVA_CODES;

/*
 * Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

Examples:

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason:
For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+2+4+7+14) is equal to the respective numbers and for 15 it is not.
 */

public class IsPerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(isPerfectNumber(num));
    }
    
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num || i == 1) {
                    sum += i;
                } else {
                    sum += i + num / i;
                }
            }
        }
        
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}
