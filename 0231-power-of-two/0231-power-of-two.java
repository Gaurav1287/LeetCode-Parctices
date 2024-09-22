class Solution {
    public boolean isPowerOfTwo(int n) {
        //n=4 then  n&(n-1) means 4 & 3 --> 0100 & 0011-->0000=0 true 
        
         return n > 0 && (n & (n - 1)) == 0;
        // while(n%2==0)
        // {
        //     n=n/2;
        // }
        // return n==1;
    }
}