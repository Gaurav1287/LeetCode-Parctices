class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int max=1;
        int count=1;
        for(int i=1 ;i<n;i++)
        {
            char ch=s.charAt(i);
            char p=s.charAt(i-1);
            if(ch == p)
            {
                count++;
            }
            else
            {
            max=Math.max(max,count);
            count=1;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}