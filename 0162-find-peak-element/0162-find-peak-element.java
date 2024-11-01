class Solution {
    public int findPeakElement(int[] nums) {
       if(nums.length==1)
       {
        return 0;
       }
       else if(nums[0]>nums[1])
       {
        return 0;
       }
       else if(nums[nums.length-1]>nums[nums.length-2])
       {
        return nums.length-1;
       }
       
        int s=1;
        int end=nums.length-2;
        while(s<=end)
        {
            int mid=(s+end)/2;
            if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                s=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
         return -1;
       
      
    }
}