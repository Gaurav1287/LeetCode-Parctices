class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> st=new ArrayList<>();
        int max=0;
        for(int cand:candies)
        {
            max=Math.max(max,cand);
        }
        for(int num:candies)
        {
            if(num+extraCandies>=max)
            {
                st.add(true);
            }
            else
            {
                st.add(false);
            }
        }
        return st;
    }
}