class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     
         List<Boolean> ch=new ArrayList<>();
        int max=0;
        for(int num:candies)
        {
            max=Math.max(max,num);
        }
        for(int candy:candies)
        {
            if(candy+extraCandies>=max)
            {
                ch.add(true);
            }
            else
            {
                ch.add(false);
            }
        }
        return ch;
    }
}