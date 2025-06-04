class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sh=new HashSet<>();
        for(int n:nums)
        {
            if(sh.contains(n))
            {
                return true;
            }
            sh.add(n);
        }
        return false;
    }
}