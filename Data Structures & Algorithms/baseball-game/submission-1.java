class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations) {
            if (op.equals("+")) {
                int second = st.pop();
                int first = st.pop();
                int sum = second+first;
                st.push(first);
                st.push(second);
                st.push(sum);
            }
            else if (op.equals("C")) {
                st.pop();
            }
            else if (op.equals("5")) {
                st.push(5);
            }
            else if(op.equals("D")) {
                int first = st.pop();
                int mult = 2*first;
                st.push(first);
                st.push(mult);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}