package JAVA_CODES;

/*
 * You are given an array. The task is to reverse the array and print it. 

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */


import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 ,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
