class Solution {
    public char findTheDifference(String s, String t) {
        int sum_s=0;
        for(char ch:s.toCharArray())
        {
            sum_s +=ch;
        }
        int sum_t=0;
        for(char ch:t.toCharArray())
        {
            sum_t +=ch;
        }
        return (char) (sum_t - sum_s);
    }
}