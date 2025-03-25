package JAVA_CODES;

/*
 * Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

Examples
Example 1:
Input:N = 2
Output:True
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
Example 2:
Input:N =10
Output: False
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
 */

public class IsPrime {
    public static void main(String[] args) {
        int num = 1483;
        System.out.println(isPrime(num));
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
