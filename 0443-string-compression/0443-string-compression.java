class Solution {
    public int compress(char[] chars) {
        int count=1;
        StringBuilder sb=new StringBuilder("");
        sb.append(chars[0]);
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i-1]!=chars[i])
            {
                if(count>1)
                {
                    sb.append(count+"");
                }
                sb.append(chars[i]);
                count=1;
            }else{
                count++;
            }
        }
        if(count>1)
        {
            sb.append(count+"");
        }
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            chars[i]=ch;
        }
        return sb.length();
    }
}