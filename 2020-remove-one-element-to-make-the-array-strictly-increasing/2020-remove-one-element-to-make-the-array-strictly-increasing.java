class Solution {
    public boolean canBeIncreasing(int[] nums) {
      int violations = 0; // Count violations
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                violations++;
                if (violations > 1) return false; 

               
                if (i > 1 && nums[i] <= nums[i - 2] && i < nums.length - 1 && nums[i + 1] <= nums[i - 1]) {
                    return false;
                }
                
            }
        }
        
        return true; 
    }
}