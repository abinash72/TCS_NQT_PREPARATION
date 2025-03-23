"""
Given an array, we have to find the smallest element in the array.

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array.

Example2:
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

"""


def findSamllest(arr):
    smallest = arr[0]
    for i in arr:
        if i <= smallest:
            smallest = i

    return smallest


def main():
    arr = [12, 5, 2, 7, 9, 5, 22, 3, 6]
    print(findSamllest(arr))


main()
