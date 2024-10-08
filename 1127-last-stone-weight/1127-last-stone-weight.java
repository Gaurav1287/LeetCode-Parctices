class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones)
        {
            pq.add(ele);
        }
        while(pq.size()>1)
        {
            int max=pq.remove();
            int secmax=pq.remove();
            int newstone=max-secmax;
            if(newstone!=0)
            {
                pq.add(newstone);
            }
        }
        if(pq.size()==0)
        {
            return 0;
        }
        else
        {
            return pq.remove();
        }
    }
}