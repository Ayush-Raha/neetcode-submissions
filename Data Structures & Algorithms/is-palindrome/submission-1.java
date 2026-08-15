class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        


        while(left<right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){

                left++;
                right--;
            }else{
                return false;
            }
            
        }
        return true;
    }
}
