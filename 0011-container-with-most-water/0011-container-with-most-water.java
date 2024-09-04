class Solution {
    public int maxArea(int[] height) {
        int b1=0;
        int b2=height.length -1;
        int res=0;
        while(b1<b2)
        {
            int cutmax=(b2-b1)*Math.min(height[b1],height[b2]);
            if(height[b1]<height[b2])
            {
                b1++;
            }
            else
            {
                b2--;
            }
            res=Math.max(res,cutmax);
        }
        return res;
    }
}