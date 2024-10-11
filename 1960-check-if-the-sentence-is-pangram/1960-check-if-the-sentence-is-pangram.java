class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>letter=new HashSet<>();
        for(char ch:sentence.toCharArray())
        {
              if (Character.isLetter(ch))
              {
                letter.add(ch);
              }
        }
        return letter.size()==26;
    }
}