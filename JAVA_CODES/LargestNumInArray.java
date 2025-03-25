package JAVA_CODES;

/*
 * Given an array, we have to find the largest element in the array.
 * 
 * Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. 
 */


public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = { 12, 5, 2, 7, 9, 5, 22, 3, 6, -8 };
        System.out.println("The largest Element in the array is "+findLargest(arr));
    }
    
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] >= largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
