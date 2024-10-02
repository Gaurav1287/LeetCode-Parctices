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
    //  int left = 0, right = nums.length - 1;

    //     while (left < right) {
    //         int mid = (left + right) / 2;
    //         if (mid % 2 == 1) {
    //             mid--;
    //         }
    //         if (nums[mid] == nums[mid + 1]) {
    //             left = mid + 2;
    //         } else {
    //             right = mid;
    //         }
    //     }

    //     return nums[left];

    int l=0,r=nums.length-1;
    if(nums.length==1)
    {
        return nums[0];
    }
    else if(nums[0]!=nums[1])
    {
        return nums[0];
    }
    else if(nums[nums.length-1]!=nums[nums.length-2])
    {
        return nums[nums.length-1];
    }
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
        {
            return nums[mid];
        }
        else if(mid%2==1)
        {
            if(nums[mid-1]==nums[mid])
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        else
        {
            if(nums[mid]==nums[mid+1])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
     }
     return -1;
    }
}