class Solution {
    public boolean areOccurrencesEqual(String s) {
       Map<Character,Integer> goodString=new HashMap<>();
       for(char ch:s.toCharArray())
       {
        goodString.put(ch,goodString.getOrDefault(ch,0)+1);
       }
       int ferq=goodString.get(s.charAt(0));
       for(int key:goodString.values())
       {
        if(key!=ferq)
        {
            return false;
        }
       }
       return true;
    }
}