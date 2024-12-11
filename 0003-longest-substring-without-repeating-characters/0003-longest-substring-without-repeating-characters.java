class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sh = new HashSet<>();

     int max=0;
     int count=0;
     for(int i=0;i<s.length();i++)
     {
        while(sh.contains(s.charAt(i)))
        {
            sh.remove(s.charAt(count));
            count++;
        }
        sh.add(s.charAt(i));
        max=Math.max(max,i-count+1);
     }  
     return max; 
     
    }
}