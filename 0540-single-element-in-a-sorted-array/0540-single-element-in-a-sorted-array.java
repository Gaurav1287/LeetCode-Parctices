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
    //         unique ^= num;  
    //     }
        
    //     return unique;
     int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}