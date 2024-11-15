class Solution {
    public double findMaxAverage(int[] nums, int k) {
    //   float max=0;
    //   float currsum=0;
    //   if(nums.length==1)
    //   {
    //     return (float) nums[0];
    //   }
    //   for(int i=0;i<nums.length;i++)
    //   {
    //     if(currsum<0)
    //     {
    //         currsum=0;
    //     }
    //     currsum=currsum+nums[i];
    //     float sum=currsum/k;
    //     max=Math.max(max,sum);
    //   }
    //   return max;
      double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        double currentSum = maxSum;
        
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum + nums[i] - nums[i - k]; 
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum / k;
    } 
}