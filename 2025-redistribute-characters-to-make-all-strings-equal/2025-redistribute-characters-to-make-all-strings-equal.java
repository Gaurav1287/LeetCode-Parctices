class Solution {
    public boolean makeEqual(String[] words) {
        int fre[]=new int[26];
        // for(int i=0;i<words.length;i++)
        // {
        //     String w=words[i];
        //     for(int j=0;j<w.length();j++)
        //     {
        //        char ch=w.charAt(j);
        //        int index=(int) ch-'a';
        //        fre[index]=fre[index]+1;
        //     }
            
        // }

        // for(int i=0;i<26;i++)
        // {
        //     if(fre[i]%words.length!=0)
        //     return false;
        // }
        // return true;
        for(String input:words)
        {
            for(char c:input.toCharArray())
            {
                fre[c-'a']++;
            }
        }
        for(int count:fre)
        {
            if(count%words.length!=0)
            {
                return false;
            }

        }
        return true;
    }
}