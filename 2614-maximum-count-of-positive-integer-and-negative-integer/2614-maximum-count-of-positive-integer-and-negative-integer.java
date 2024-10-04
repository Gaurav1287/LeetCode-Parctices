class Solution {
    public int maximumCount(int[] nums) {
       int countNeg=0;
       int countPosi=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        {
            countPosi+=1;
        }
        else if(nums[i]<0)
        {
            countNeg+=1;
        }
       } 
       if(countPosi>=countNeg)
       {
        return countPosi;
       }
       else{
          return countNeg;
       }
    }
}