class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstposition=findfirstposition(nums,target);
        int lastposition=findlastposition(nums,target);
        return new int[] {firstposition,lastposition};
    }
   public static int findfirstposition(int[] nums,int target)
   {
     int left=0;
     int firstposition=-1;
     int right=nums.length-1;
     while(left<=right)
     {
        int mid=(left+right)/2;
        if(nums[mid]>=target)
        {
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }
        if(nums[mid]==target)
        {
            firstposition=mid;
        }
     } 
     return firstposition;
   }
   public static int findlastposition(int[] nums,int target)
   {
     int left=0;
     int lastposition=-1;
     int right=nums.length-1;
     while(left<=right)
     {
        int mid=(left+right)/2;
        if(nums[mid]<=target)
        {
           left=mid+1;
        }
        else
        {
            right=mid-1;
        }
        if(nums[mid]==target)
        {
            lastposition=mid;
        }
     } 
     return lastposition;
   }
}