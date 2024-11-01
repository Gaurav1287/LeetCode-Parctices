class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>seen=new HashSet<>();
        for(int num:nums)
        {
            if(seen.contains(num))
            {
                return num;
            }
            else
            {
                seen.add(num);
            }
        }
        return -1;
    }
}