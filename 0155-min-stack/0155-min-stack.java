class MinStack {
   private Stack<Integer>st;
   private Stack<Integer>min;
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0 || min.peek()>=val)
        {
            min.push(val);
        }
        st.push(val);
        
    }
    
    public void pop() {
        int element=st.pop();
        int element1=min.peek();
        if(element==element1)
        {
            min.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */