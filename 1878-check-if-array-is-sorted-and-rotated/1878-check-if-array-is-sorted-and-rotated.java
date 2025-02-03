class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {  // Check decreasing points
                count++;
            }
            if (count > 1) {  // If more than one decrease, return false
                return false;
            }
        }
        
        return true;
    }
}