class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] result = new int[n];
        // result[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     result[i] = result[i - 1] * nums[i - 1];
        // }
        //  int R = 1;
        // for (int i = n - 1; i >= 0; i--) {
        //     result[i] = result[i] * R;
        //     R = R * nums[i];
        // }
        
        // return result;
        int result[]=new int[nums.length];
        int pre=1,post=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}
