class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long totalpair=(long)n*(n-1)/2;
        Map<Integer,Integer> pair=new HashMap<>();
        long goodpair=0;
        for(int j=0;j<n;j++)
        {
            int key=nums[j]-j;
            goodpair +=pair.getOrDefault(key,0);
            pair.put(key,pair.getOrDefault(key,0)+1);
        }
        return totalpair-goodpair;
    }
}