class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer>uniquesum=new HashMap<>();
        for(int num:nums)
        {
            uniquesum.put(num,uniquesum.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int key:uniquesum.keySet())
        {
            if(uniquesum.get(key)==1)
            {
               sum +=key;
            }
        }
        return sum;
    }
}