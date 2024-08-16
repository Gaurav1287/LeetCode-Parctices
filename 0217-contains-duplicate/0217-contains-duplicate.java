class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     int cont=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=i+1;j<nums.length;j++)
    //         {
    //             if(nums[i]==nums[j])
    //             {
    //                 cont=cont+1;
                    
    //             }
    //         }
    //     }
    //    if(cont>0)
    //    {
    //     return true;
    //    }
    //    else
    //    {
    //     return false;
    //    }
       Set<Integer>visit=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        if(visit.contains(nums[i]))
        {
            return true;
        }
        visit.add(nums[i]);
       }
       return false;
     }
}