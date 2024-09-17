class Solution {
    public int majorityElement(int[] nums) {
        int majority =nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(majority==nums[i])
              {
                count++;
              }
          else{ 
              count--;
            if(count==0)
            {
              majority=nums[i];
              count=1;
            }
          }
        }
        return majority;
    }
}