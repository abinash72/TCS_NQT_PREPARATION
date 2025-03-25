package JAVA_CODES;

/*
 * Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 * 
 */

public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 5, 2, 7, 9, 5, 22, 3, 6, -8 ,1};
        System.out.println(findSecondSmallest(arr));
        System.out.println(findSecondLargest(arr));
    }
    
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] <= secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
