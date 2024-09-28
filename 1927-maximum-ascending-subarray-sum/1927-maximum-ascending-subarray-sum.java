class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int curmax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
               curmax=curmax+nums[i];
            }
            else
            {
                max=Math.max(max,curmax);
                curmax=nums[i];
            }
            
        }
        max=Math.max(max,curmax);
        return max;
    }
}