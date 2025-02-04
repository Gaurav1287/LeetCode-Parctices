class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0,end=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        while(end<n)
        {
            sum +=nums[end];
            while(sum>=target)
            {
                minlen=Math.min(minlen,end-start+1);
                sum -=nums[start];
                start++;
            }
            end++;
        }
        if(minlen==Integer.MAX_VALUE)
        {
            return 0;
        }
        else 
        {
            return minlen;
        }
    }
}