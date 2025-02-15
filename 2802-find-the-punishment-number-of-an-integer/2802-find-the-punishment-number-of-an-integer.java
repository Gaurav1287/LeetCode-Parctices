class Solution {
    public boolean isPartition(int i, String s, int num, int cursum) {
        int n = s.length();
        if (i == n) {
            return cursum == num;
        }
        if (cursum > num) {
            return false;
        }
        for (int j = i; j < s.length(); j++) {
            int val = Integer.parseInt(s.substring(i, j + 1)); 
            if (isPartition(j + 1, s, num, cursum + val))
             { 
                return true;
             }
        }
        return false;
    }

    public int punishmentNumber(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) 
        { 
            String s = Integer.toString(i * i);
            if (isPartition(0, s, i, 0)) 
            {
                res += i * i;
            }
        }
        return res;
        
    }
}