package JAVA_CODES;

import java.util.Arrays;

/*
 * Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 */

public class FindMedian {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };

        Arrays.sort(arr);

        if (arr.length % 2 == 0) {
            int index1 = arr.length / 2;
            int index2 = arr.length / 2 - 1;

            int median = (arr[index1] + arr[index2]) / 2;
            System.out.println(median);
        } else {
            int median = arr[arr.length / 2];
            System.out.println(median);
        }
    }
}
