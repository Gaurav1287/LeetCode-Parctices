class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxfish=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]>0)
                {
                   maxfish=Math.max(maxfish,Dfs(grid,i,j));
                }
            }
        }
        return maxfish;
    }
    private int Dfs(int grid[][],int i,int j)
    {
        
         if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
         {
            return 0;
        }
        int fishcount=grid[i][j];
        grid[i][j]=0;
        fishcount +=Dfs(grid,i-1,j);//up
        fishcount +=Dfs(grid,i+1,j);//down
        fishcount +=Dfs(grid,i,j-1);//left
        fishcount +=Dfs(grid,i,j+1);//right
        return fishcount;
    }
}