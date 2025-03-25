package JAVA_CODES;

/*
 * Given an integer N, print all of its prime factors.

Examples
Example 1:
Input: N=60
Output: 2, 3, 5
Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
Example 2:
Input: N=35
Output: 5, 7
Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime.
 */

public class FindAllPrimeFactors {
    public static void main(String[] args) {
        findallprime(35);
    }
    
    public static void findallprime(int n) {
        System.out.println("All Prime factors of "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
    }
    

    public static boolean isPrime(int num) {
        boolean isprime = true;
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}
