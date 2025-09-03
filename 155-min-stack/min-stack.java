class MinStack {
    Stack<Integer> s;
    Stack<Integer> st;
    public MinStack() {
        s=new Stack<>();
        st=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(st.isEmpty() || st.peek()>=val)st.push(val);
    }
    
    public void pop() {
        if(s.peek().equals(st.peek()))st.pop();
        s.pop();

    }
    
    public int top() {
        return s.isEmpty()?-1:s.peek();
    }
    
    public int getMin() {
        return st.isEmpty()?-1:st.peek();
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