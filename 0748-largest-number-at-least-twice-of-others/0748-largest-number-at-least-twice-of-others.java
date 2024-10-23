class Solution {
    public int dominantIndex(int[] nums) {
     int max=-1;
     int secmax=-1;
     int index=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>max)
        {
            secmax=max;
            max=nums[i];
            index=i;
        }
        else if(secmax<nums[i])
        {
            secmax=nums[i];
        }
     }  
     if(secmax*2<=max)
     {
        return index;
     } 
     return -1;
    }
}