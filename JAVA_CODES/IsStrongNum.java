package JAVA_CODES;

/*
 * Given an integer Print “YES” if it is a strong number else print “NO”.

Note : 

When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
Strong number is also known as Krishnamurthi number/Peterson Number.
Examples:

Examples 1:
Input: N = 145
Output: Yes
Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

Example 2:
Input:  26
Output: No
Explanation: 2! + 6! = 722. Hence 26 is not a strong number.
 */

public class IsStrongNum {
    public static void main(String[] args) {
        System.out.println(isstrongnum(26));
    }
    
    public static boolean isstrongnum(int num) {
        int x = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res = res + factorial(rem);
            num /= 10;
        }

        if (res == x) {
            return true;
        } else {
            return false;
        }
    }

    public static int factorial(int n) {
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;
        }
        return res;
    }
}
