class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        
        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int ways = 0;

        // Iterate through the array (excluding the last element for splitting)
        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            // Check if the left sum is greater than or equal to the right sum
            if (leftSum >= rightSum) {
                ways++;
            }
        }

        return ways;
    }
}