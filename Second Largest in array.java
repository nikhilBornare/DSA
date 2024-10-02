/* Problem statement

You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^2
1<=arr[i]<=10^3

Time Limit: 1 sec
Sample Input 1:
5
4 3 10 9 2
Sample Output 1:
9
Sample Input 2:
7
13 6 31 14 29 44 3
Sample Output 2:
31 */

public class Solution {
    public static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            return Integer.MIN_VALUE; // Return some error code or message indicating invalid input
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        return second;
    }
}
