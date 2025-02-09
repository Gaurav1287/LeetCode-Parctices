class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[j-1])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}