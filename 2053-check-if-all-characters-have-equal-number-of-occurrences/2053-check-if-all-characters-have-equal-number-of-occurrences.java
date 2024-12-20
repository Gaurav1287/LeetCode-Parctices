class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> ma=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            ma.put(ch,ma.getOrDefault(ch,0)+1);
        }
        int freq=ma.get(s.charAt(0));
        for(int key:ma.values())
        {
            if(key!=freq)
            {
                return false;
            }
        }
        return true;
    }
}