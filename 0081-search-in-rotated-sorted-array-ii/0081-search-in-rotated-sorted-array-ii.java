class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        
        while (l <= r) {
            int mid =( l + r ) / 2; 
            
            if (nums[mid] == target) {
                return true;
            }
            
            
            if (nums[l] < nums[mid]) {
                // Target is in the left sorted half
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (nums[l] > nums[mid]) { 
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else { 
                l++;
            }
        }
        
        return false;
    }
}
