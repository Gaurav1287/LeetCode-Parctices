class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
    //  for(int i=0;i<nums.length;i++)
    //   {
    //      for(int j=i+1;j<nums.length;j++)
    //      {
    //          if(nums[i]==nums[j])
    //          {
    //             int a=Math.abs(i-j);
            
    //             if(a<=k)
    //             {
    //                 return true;
    //             }
    //          }
    //      }
    //   }
    //   return false;
//    Set <Integer>set=new HashSet<>();
//     for(int i=0;i<nums.length;i++)
//     {
//         if(set.contains(nums[i]))
//         return true;
//         set.add(nums[i]);
//         if(set.size()>k)
//         {
//             set.remove(nums[i-k]);
//         }
//     }
//     return false;
  Map<Integer,Integer>map=new HashMap<>();
  for(int i=0;i<nums.length;i++)
  {
    if(map.containsKey(nums[i]))
    {
        int j=map.get(nums[i]);
        if(i-j<=k)
        {
            return true;
        }
    }
    map.put(nums[i],i);
  }
  return false;
 }
}