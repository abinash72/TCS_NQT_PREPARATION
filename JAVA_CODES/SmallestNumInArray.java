package JAVA_CODES;

/* Given an array, we have to find the smallest element in the array.

 * Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
 * 
*/



public class SmallestNumInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 5, 2, 7, 9, 5, 22, 3, 6 ,-8};
        System.out.println("The minimum element in the array is "+findMinNum(arr));
    }

    public static int findMinNum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}