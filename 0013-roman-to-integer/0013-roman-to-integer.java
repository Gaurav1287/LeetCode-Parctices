class Solution {
    public int romanToInt(String s) {
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int ans=0;
        int i=0;
     for(int j=0;j<symbol.length;j++)
     {
        while(i<s.length() && s.startsWith(symbol[j],i))
        {
            ans +=value[j];
            i +=symbol[j].length();
        }
     }   
     return ans;
    }
}