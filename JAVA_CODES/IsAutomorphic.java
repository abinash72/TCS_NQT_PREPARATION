package JAVA_CODES;


/*
 * Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples:

Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number.
 */

public class IsAutomorphic {
    public static void main(String[] args) {
        System.out.println(isautomorphic(76));
    }
    
    public static boolean isautomorphic(int num) {
        int sq = num * num;
        int x = num;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        if (sq%Math.pow(10, count) == x) {
            return true;
        } else {
            return false;
        }
    }
}
