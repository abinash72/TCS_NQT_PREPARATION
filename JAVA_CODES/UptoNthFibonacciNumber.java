package JAVA_CODES;

/*
 * Given an integer N. Print the Fibonacci series up to the Nth term.

Examples:

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
 */

public class UptoNthFibonacciNumber {
    public static void main(String[] args) {
        printUptoNthFibonacciTerm(6);
    }
    
    public static void printUptoNthFibonacciTerm(int N) {
        if (N == 0) {
            System.out.print("The Nth Fibonacci term till " + N + "th term is: ");
            System.out.println(0);
        } else {
            int first = 0;
            int second = 1;
            System.out.println("The Nth Fibonacci tern till " + N + "th term is: ");
            System.out.print(first + " " + second+" ");
            int current;
            for (int i = 2; i <= N; i++) {
                current = first + second;
                first = second;
                second = current;
                System.out.print(current+" ");
            }
        }
    }
}
