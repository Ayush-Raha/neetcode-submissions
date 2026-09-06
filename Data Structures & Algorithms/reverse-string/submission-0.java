class Solution {
    public void reverseString(char[] s) {
        int left;
        int right= s.length-1;
        for(left=0;left<right;left++){
           char temp;
           temp=s[left];
           s[left]=s[right];
           s[right]=temp;
           
           right--;

        }
        
    }
}