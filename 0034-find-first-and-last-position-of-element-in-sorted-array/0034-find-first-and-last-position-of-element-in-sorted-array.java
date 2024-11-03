class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int low = 0, high = nums.length - 1;
        // int lastIndex = -1;
        //  int firstIndex = -1;
        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //   if (nums[mid] <= target) {
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }

        //     if (nums[mid] == target) {
        //         lastIndex = mid;
        //     }
        //     else{
        //         if (nums[mid] >= target) {
        //         high = mid - 1;
        //        } else {
        //         low = mid + 1;
        //       }

        //       if (nums[mid] == target) {
        //         firstIndex = mid;
        //        }
        //     }
        // }
        // return new int[]{lastIndex,firstIndex};
        int firstIndex = findFirstPosition(nums, target);
        int lastIndex = findLastPosition(nums, target);
        
        return new int[]{firstIndex, lastIndex};
    }
    
    private int findFirstPosition(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = (low + high )/ 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) {
                firstIndex = mid;
            }
        }

        return firstIndex;
    }

    private int findLastPosition(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) {
                lastIndex = mid;
            }
        }

        return lastIndex;

    }
}