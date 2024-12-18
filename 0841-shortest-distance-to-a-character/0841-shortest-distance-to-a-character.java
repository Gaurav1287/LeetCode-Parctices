class Solution {
    public int[] shortestToChar(String s, char c) {
     int n=s.length();
     int res[]=new int[n];
     List<Integer> index =new ArrayList<>();
     for(int i=0;i<n;i++)
     {
        if(s.charAt(i)==c)
        {
            index.add(i);
        }
     }
     for(int i=0;i<n;i++)
     {
        int max=Integer.MAX_VALUE;
        for(int indexies:index)
        {
              max=Math.min(max,(Math.abs(i-indexies)));
        }
        res[i]=max;
     }
     return res;
    }
}