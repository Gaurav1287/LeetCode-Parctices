class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int currmax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                currmax +=nums[i];
            }
            else
            {
                max=Math.max(max,currmax);
                currmax=nums[i];
            }
        }
        max=Math.max(max,currmax);
        return max;
    }
}