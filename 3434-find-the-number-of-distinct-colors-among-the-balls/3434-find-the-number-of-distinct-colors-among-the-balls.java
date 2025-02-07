class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer>ballcol=new HashMap<>();
        Map<Integer,Integer>colCount=new HashMap<>();
        int n=queries.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int ball=queries[i][0];
            int color=queries[i][1];
            if(ballcol.containsKey(ball))
            {
                int oldcolor=ballcol.get(ball);
                colCount.put(oldcolor,colCount.get(oldcolor)-1);
                if(colCount.get(oldcolor)==0)
                {
                    colCount.remove(oldcolor);
                }
            }
             ballcol.put(ball, color);
            colCount.put(color, colCount.getOrDefault(color, 0) + 1);
            result[i] = colCount.size();

        }
        return result;
        
    }
}