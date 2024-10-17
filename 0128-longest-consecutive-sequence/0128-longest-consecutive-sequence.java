class Solution {
    public int longestConsecutive(int[] nums) {
        // HashMap<Integer,Boolean>hm=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hm.put(nums[i],false);
        // }
        
        // for(int key:hm.keySet())
        // {
        //     if(hm.containsKey(key-1)==false)
        //     {
        //         hm.put(key,true);
        //     }
        // }
        // int max=0;
        // for(int key:hm.keySet())
        // {
        //     int k=1;
        //     if(hm.get(key)==true)
        //     {
        //         while(hm.containsKey(key+k)==true)
        //         {
        //             k++; 
        //         }
        //     }
        //     max=Math.max(max,k);
        // }
        // return max;
     Arrays.sort(nums);
     int count=1;
     int max=1;
     if(nums.length==0)
     {
        return 0;
     }
     for(int i=1;i<nums.length;i++)
     {
        
        int a=nums[i-1]+1;
        int b=nums[i];
         if(nums[i]==nums[i-1])
         {
            continue;
         }
        if(a==b)
        {
        	count++;
        }
        else{
            max=Math.max(max,count);
           count=1;
        }
     } 
      max=Math.max(max,count);
      return max;
    }
}