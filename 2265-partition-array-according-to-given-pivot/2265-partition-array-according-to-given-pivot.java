class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int res[]=new int[n];
        int ind=0;
        for(int num:nums)
        {
            if(num<pivot)
            {
                res[ind++]=num;
            }
        }
        for(int num:nums)
        {
            if(num==pivot)
            {
              res[ind++]=num;
            }
        }
        for(int num:nums)
        {
            if(num>pivot)
            {
                res[ind++]=num;
            }
        }
     return res;   
    }
}