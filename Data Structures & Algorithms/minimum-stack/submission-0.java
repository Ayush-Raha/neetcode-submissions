class MinStack {
    
    ArrayDeque <Integer> stack;
    ArrayDeque <Integer> min;
    public MinStack() {
        stack = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int pop = stack.pop();
        if(pop == min.peek()) min.pop();
    
    }
    
    public int top() {
        int top= stack.peek();
        return top;
    }
    
    public int getMin() {
        return min.peek();
    }
}
