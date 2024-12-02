class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
		// {
		// 	for(int j=i+1;j<nums.length;j++)
		// 	{
		// 		int sum=nums[i]+nums[j];
		// 		if(sum==target)
		// 		{
		// 			return new int[]{i, j};
		// 		}
		// 	}
		// }
        // return null;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
        // int l=0;
        // int r=nums.length-1;
        // // Arrays.sort(nums);
        // while(l<r)
        // {
        //     int sum=nums[l]+nums[r];
        //     if(sum==target)
        //     {
        //         return new int[]{l,r};
        //     }
        //     else if(sum<target )
        //     {
        //         l++;
        //     }
        //     else
        //     {
        //         r--;
        //     }
        // }
        // return new int[0];
    }
}