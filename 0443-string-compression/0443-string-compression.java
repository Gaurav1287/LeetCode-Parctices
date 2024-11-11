class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
       
        int r=chars.length;
        while(i<r)
        {
            int count=0;
            char ch=chars[i];
            while(i<r && chars[i]==ch)
            {
                 count++;
                 i++;
            }
            chars[index]=ch;
            index++;
            if(count>1)
            {
                String st=Integer.toString(count);
                for(char c:st.toCharArray())
                {
                    chars[index]=c;
                    index++;
                }
            }
        }
        return index;
    }
}