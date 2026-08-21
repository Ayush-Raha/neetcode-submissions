class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(c.equals("-")){
               int right = stack.pop();
                 int left = stack.pop();
                stack.push(left-right);
            }else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(c.equals("/")){
               int right = stack.pop();
               int left = stack.pop();
                stack.push(left/right);
            }else{
                stack.push(Integer.parseInt(c));
            }
        }return stack.peek();
    }
}
