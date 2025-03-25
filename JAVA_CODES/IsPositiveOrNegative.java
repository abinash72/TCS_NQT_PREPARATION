package JAVA_CODES;

/*
 * Given a number n check whether it's positive or negative.

Examples:

Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative
 */

public class IsPositiveOrNegative {
    public static void main(String[] args) {
        int num = -9;
        if (num >= 0) {
            System.out.println("Postive");
        } else {
            System.out.println("Negative");
        }
    }

    /*
     * Second Approach :
     * he signed right shift operator '>>' uses the sign bit to fill the trailing positions. For example, if the number is positive then 0 will be used to fill the trailing positions and if the number is negative then 1 will be used to fill the trailing positions.

Hence we can say that if a number is positive and we right shift it by 31, then we will get zero, and if the number is negative then we will get -1.

For eg:  a = 5 ,  b = -6

a = 0000 0000 0000 0000 0000 0000 0000 0101 = 5

b = 1111 1111 1111 1111 1111 1111 1111 1010 = -6

a>>31 

a= 0000 0000 0000 0000 0000 0000 0000 0000 = 0

b>>31

b= 1111 1111 1111 1111 1111 1111 1111 1111 = -1

Approach:

Right Shift n by 31.
If we get 0 then n is positive.
If we get -1 then n is negative.
     * 
     */
}
