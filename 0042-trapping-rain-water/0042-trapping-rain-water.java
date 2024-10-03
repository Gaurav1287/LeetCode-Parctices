class Solution {
    public int trap(int[] height) {
       int n=height.length;
       int leftmax[]= new int[n];
       leftmax[0]=height[0];
       for(int i=1;i<n;i++)
       {
           leftmax[i]=Math.max(leftmax[i-1],height[i]);
       }
       int rigthmax[]=new int[n];
       rigthmax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--)
       {
        rigthmax[i]=Math.max(rigthmax[i+1],height[i]);
       }
       int ans=0;
       for(int i=0;i<n;i++)
       {
        ans+=Math.min(leftmax[i],rigthmax[i])-height[i];
       }
       return ans;
    }
}