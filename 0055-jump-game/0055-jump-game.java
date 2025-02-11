class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<=n;i++)
        {
            if(i>max)
            {
                return false;
            }
            max=Math.max(max,nums[i]+i);
            if(max>=n-1)
            {
                return true;
            }
        }
        return false;
    }
}