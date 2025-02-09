class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>maj=new HashMap<>();
        int n=nums.length;
        for(int num:nums)
        {
            maj.put(num,maj.getOrDefault(num,0)+1);
            if(maj.get(num)>nums.length/2)
            {
                return num;
            }
        }
        return -1;
    }
}