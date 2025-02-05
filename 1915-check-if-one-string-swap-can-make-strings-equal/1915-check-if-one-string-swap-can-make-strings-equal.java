class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1, second = -1;
        int count=0;
        if(s1.equals(s2))
        {
            return true;
        }
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                if(count==1)
                {
                    first=i;
                }
                else if(count==2)
                {
                    second=i;
                }
                else
                {
                  return false;
                }
            }
        }
     return count == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }
}