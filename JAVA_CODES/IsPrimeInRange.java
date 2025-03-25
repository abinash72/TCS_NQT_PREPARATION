package JAVA_CODES;

/*
 * Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

Examples:

Examples:
Input: 2 10
Output: 2 3 5 7 
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13 
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.
 */

public class IsPrimeInRange {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    
    public static boolean isPrime(int num) {
        boolean isprime = true;
        if (num <= 2 && num >0) {
            return isprime;
        } else if(num == 0){
            return false;
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
