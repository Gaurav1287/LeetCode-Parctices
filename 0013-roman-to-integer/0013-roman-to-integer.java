class Solution {
    public int romanToInt(String s) {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int ans = 0;
        int i = 0;
        
        for (int j = 0; j < symbols.length; j++) {
            while (i < s.length() && s.startsWith(symbols[j], i)) {
                ans += values[j];
                i += symbols[j].length();
            }
        }
        
        return ans;
    }
}