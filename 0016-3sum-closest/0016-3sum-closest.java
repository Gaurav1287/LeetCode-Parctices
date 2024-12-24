class Solution {
    public int threeSumClosest(int[] nums, int target) {
         int colest=100000;
         Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++)
        {
           int left=i+1;
           int right=nums.length-1;
           while(left<right)
           {
               int sum=nums[i] + nums[left] +nums[right];
                if(Math.abs(target-sum)< Math.abs(target-colest))
                {
                    colest=sum;
                }
                else if(sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
           }
        
      }
      return colest;

    }
}