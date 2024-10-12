/* Move All Negative Numbers To Beginning And Positive To End

Input : [1 , 2 , -3 , 4 , -4 , -5 ]

Output : -3 , -5 , -4 , 2 , 4 , 1]  */
public class Solution {
    public static int[] separateNegativeAndPositive(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            // If a[l] is negative and a[r] is positive, move on
            if (a[l] < 0 && a[r] > 0) {
                l++;
                r--;
            }
            // If a[l] is positive and a[r] is negative, swap them
            else if (a[l] > 0 && a[r] < 0) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            // If both a[l] and a[r] are negative, move the left pointer
            else if (a[l] < 0) {
                l++;
            }
            // If both a[l] and a[r] are positive, move the right pointer
            else {
                r--;
            }
        }
        return a;
    }
}
