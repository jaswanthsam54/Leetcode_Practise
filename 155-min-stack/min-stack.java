class MinStack {
    private Deque<Integer> main;
    private Deque<Integer> minstack;
    public MinStack() {
        main = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        main.push(value);
        int currmin=minstack.isEmpty()?value:Math.min(minstack.peek(),value);
        minstack.push(currmin);
    }
    
    public void pop() {
        main.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */