class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> sh=new ArrayList<>();
        int max=0;
        for(int candy:candies)
        {
            max=Math.max(max,candy);
        }
        for(int num:candies)
        {
            if(num+extraCandies >=max)
            {
                sh.add(true);
            }
            else
            {
                sh.add(false);
            }
        }
        return sh;
    }
}