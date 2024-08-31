class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();
        // int lastSpaceIndex = s.lastIndexOf(' ');
        // return s.length() - lastSpaceIndex - 1;
         int length = 0;
        int n = s.length();
        
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        
        return length;
    }
}