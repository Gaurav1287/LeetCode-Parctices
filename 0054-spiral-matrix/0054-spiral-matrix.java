class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res=new ArrayList<>();
       int n=matrix.length-1;
       int m=matrix[0].length-1; 
       int rows=0,rowend=n,cols=0,colend=m;
       while(rows<=rowend && cols<=colend)
       {
        for(int i=cols;i<=colend;i++)
        {
            res.add(matrix[cols][i]);
        }
        rows += 1;
        for(int i=rows;i<=rowend;i++)
        {
            res.add(matrix[i][colend]);
        }
        colend-=1;
          if(rows<=rowend)
          {
            for(int i=colend;i>=cols;i--)
            {
                res.add(matrix[rowend][i]);
            }
            rowend-=1;
          }
          if(cols<=colend)
          {
            for(int i=rowend;i>=rows;i--)
            {
                res.add(matrix[i][cols]);
            }
            cols+=1;
          }
       }  
      return res;  
    }
}