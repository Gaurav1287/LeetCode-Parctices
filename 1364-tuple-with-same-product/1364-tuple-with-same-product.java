class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> procount=new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int multi=nums[i]*nums[j];
                result +=procount.getOrDefault(multi,0)*8;
                procount.put(multi,procount.getOrDefault(multi,0)+1);
            }
        }
        return result;
        
    }
}