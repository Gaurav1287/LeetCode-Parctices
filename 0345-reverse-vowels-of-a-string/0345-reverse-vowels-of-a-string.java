class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        int l=0;
        char ch[]=s.toCharArray();
        int r=ch.length -1;
        while(l<r)
        {
            while(l<r && vowels.indexOf(ch[l])==-1 )
            {
                l++;
            }
            while(l<r && vowels.indexOf(ch[r])==-1)
            {
                r--;
            }
            if(l<r)
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }

        }
        return new String(ch);
    }
}