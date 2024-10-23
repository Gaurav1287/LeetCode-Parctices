class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>hm=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(hm.size()<k)
            {
                hm.add(nums[i]);
            }
            else if(hm.peek()<nums[i])
            {
                hm.remove();
                hm.add(nums[i]);
            }
        }
        return hm.peek();
    }
}