package JAVA_CODES;

/*
 * Given a number n, check whether a given number is even or odd.

Examples:

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2.
 */

public class IsEvenOrOdd {
    public static void main(String[] args) {
        int num = 33;
        if (num % 2 == 0) {
            System.out.println(num +" Is Even");
        } else {
            System.out.println(num + " Is Odd");
        }
    }
}
