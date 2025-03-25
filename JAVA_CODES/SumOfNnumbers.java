package JAVA_CODES;

/*
 *  Given a number ‘N’, find out the sum of the first N natural numbers.

Examples:

Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=21
 */

public class SumOfNnumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = (n * (n + 1)) / 2;
        System.out.println("The sum of "+n+" numbers is "+sum);
    }
}
