/* LEETCODE 53 - MAXIMUM SUBARRAY (KADANE'S ALGORITHM)
 Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6. */

class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize variables to track current subarray sum and maximum sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the array using a normal for loop
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            currSum += nums[i];

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(currSum, maxSum);

            // If the current sum becomes negative, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }
        }

        // Return the maximum subarray sum
        return maxSum;
    }
}
