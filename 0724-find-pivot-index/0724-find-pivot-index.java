class Solution {
    public int pivotIndex(int[] nums) {
        int rsum=0;
        int lsum=0;
        for(int num:nums)
        {
            rsum+=num;
        } 
        for(int i=0;i<nums.length;i++)
        {
            rsum -=nums[i];
            
            if(rsum==lsum)
            {
                return i;
            }
            lsum +=nums[i];
        }
        return -1;
    }
}