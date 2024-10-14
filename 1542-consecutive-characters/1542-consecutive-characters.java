class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        for(int i=1;i<s.length();i++)
        {
            char p=s.charAt(i);
            char ch=s.charAt(i-1); 
            if(p==ch)
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