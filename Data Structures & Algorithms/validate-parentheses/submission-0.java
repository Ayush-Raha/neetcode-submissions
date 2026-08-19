class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> brack = new HashMap<>();
        brack.put(')', '(');
        brack.put(']', '[');
        brack.put('}', '{');
        for (char c : s.toCharArray()){
            if(brack.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==brack.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
            
        }return stack.isEmpty();

    }
}
