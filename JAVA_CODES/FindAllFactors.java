package JAVA_CODES;

/*
 * Find all factors of a number or find all distinct divisors of a natural number.

Examples:

Example 1:
Input: n = 6
Output: 1,2,3,6
Explanation: 6 is divisible by 1,2,3,6

Example 2:
Input: n = 9
Output: 1,3,9
Explanation: 9 is divisible by 1,3,9
 */

public class FindAllFactors {
    public static void main(String[] args) {
        findAllFactors(9);
    }
    
    public static void findAllFactors(int n) {
        System.out.println("All the factors of "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
