class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean zerorow[]=new boolean[m];
        boolean zerocol[]=new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    zerorow[i]=true;
                    zerocol[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(zerorow[i])
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            if(zerocol[j])
            {
                for(int i=0;i<m;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}