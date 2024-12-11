class Solution {
    public String reverseVowels(String s) {
        String vowles="aieouAEIOU";
        char ch[]=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r)
        {
          while(l<r && vowles.indexOf(ch[l])==-1)
          {
            l++;
          }
          while(l<r && vowles.indexOf(ch[r])==-1)
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