class ProductOfNumbers {
    List<Integer> st=new ArrayList<>();
    public ProductOfNumbers() {
       st.clear();
    }
    
    public void add(int num) {
        if(num==0)
        {
            st.clear();
            return;
        }
        int prev=(st.size()==0)?1:st.get(st.size()-1);
        st.add(num*prev);
    }
    
    public int getProduct(int k) {
        int s=st.size();
        if(s<k) return 0;
        else if(s==k) return st.get(s-1);
        else return st.get(s-1)/st.get(s-1-k);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */