package max.subarray.sum;

// https://leetcode.com/problems/maximum-subarray/
public class MaxSubarraySum {

    // [5,4,-1,7,8] -> 24 instead of 23
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            currentSum = Math.max(currentSum + current, current);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
