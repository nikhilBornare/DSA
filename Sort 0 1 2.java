/* Sort 0 1 2 (DUTCH NATIONAL FLAG ALGORITHM )

Input : 0 1 1 0 1 2 1 2 0 0 0

Output: 0 0 0 0 0 1 1 1 1 2 2 */

public class Solution {
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
