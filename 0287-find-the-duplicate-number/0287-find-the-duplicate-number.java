class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer>seen=new HashSet<>();
        // for(int num:nums)
        // {
        //     if(seen.contains(num))
        //     {
        //         return num;
        //     }
        //     else
        //     {
        //         seen.add(num);
        //     }
        // }
        // return -1;
        int low = 1;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            // Count how many numbers are less than or equal to mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            // If count is greater than mid, the duplicate is in the lower half
            if (count > mid) {
                high = mid;
            } else {
                // Otherwise, the duplicate is in the upper half
                low = mid + 1;
            }
        }
        
        // The duplicate number
        return low;
    }
}