class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String dou=s+s;
       return dou.substring(1,dou.length()-1).contains(s);
    }
}