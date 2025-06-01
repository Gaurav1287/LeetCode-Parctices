class Solution {
    public boolean isValid(String s) {
        Stack<Character> sh=new Stack<>();
        int n=s.length();
        if(n%2!=0)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' || ch =='{' || ch =='[')
            {
                sh.push(ch);
            }
            else
            {
                if(sh.isEmpty())
                {
                    return false;
                }
                char top=sh.peek();
                if(ch == ')' && top!='(' )
                {
                    return false;
                }
                if(ch == '}' && top!='{' )
                {
                    return false;
                }
                if(ch == ']' && top!='[' )
                {
                    return false;
                }
                else
                {
                    sh.pop();
                }
            }
        }
        return sh.isEmpty();
    }
}