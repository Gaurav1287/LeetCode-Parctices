class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pos=1;
        int pre=1;
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=pos;
            pos=pos*nums[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            res[i]=res[i]*pre;
            pre=nums[i]*pre;
        }
        return res;
    }
}