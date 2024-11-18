class Solution {
    public int tribonacci(int n) {
        int sum=0,a=0,b=1,c=1;
        if(n==0)
        {
            return 0;
        }
        else if(n==1 || n==2)
        {
            return 1;
        }
        for(int i=1;i<=n;i++)
        {
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
            
        }
        return a;
    }
}