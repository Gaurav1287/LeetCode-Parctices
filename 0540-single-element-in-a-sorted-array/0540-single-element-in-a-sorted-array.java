class Solution {
    public int singleNonDuplicate(int[] nums) {
    // HashSet<Integer>hash=new HashSet<>();
    // for(int num:nums)
    //  {
    //     hash.add(num);
    //   }
    //     return;
    // int unique = 0;
        
    //     for (int num : nums) {
    //         unique ^= num;  // XOR each element
    //     }
        
    //     return unique;
    int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even for easier pair checking
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the mid element is part of a matching pair
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}