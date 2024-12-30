class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int uniqueIndex = 1;
        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[uniqueIndex - 1]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        return uniqueIndex + 1; 
    }
}