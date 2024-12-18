class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int leftsum=0;
        for(int num:nums)
        {
            total+=num;
        }
        for(int i=0;i<nums.length;i++)
        {
            total -=nums[i];
            {
                if(total==leftsum)
                {
                    return i;
                }
                leftsum +=nums[i];
            }
        }
        return -1;
    }
}