package JAVA_CODES;

/*
 * Given a number N, print the smallest and largest digits present in the number.

Examples:

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.
 */

public class MinAndMaxDigit {
    public static void main(String[] args) {
        int num = 2358;
        min_max_digit(num);
    }
    
    public static void min_max_digit(int num) {
        int min_digit = Integer.MAX_VALUE;
        int max_digit = Integer.MIN_VALUE;

        while (num > 0) {
            int rem = num % 10;
            if (rem < min_digit) {
                min_digit = rem;
            }
            if (rem > max_digit) {
                max_digit = rem;
            }

            num /= 10;
        }

        System.out.println("Minimum digit: "+min_digit+" and Maximum digit: "+max_digit);
    }
}
