class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>has=new HashSet<>();
         int max=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            while(has.contains(s.charAt(i)))
            {
                has.remove(s.charAt(count));
                count++;
            }
            has.add(s.charAt(i));
             max=Math.max(max,i-count+1);
        }
        return max;
    }
}