class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        int[] alpha = new int[26];
        for(int i = 0; i< s.length(); i++ ){
            int scount = (int)(s.charAt(i)-'a');
            int tcount = (int)(t.charAt(i)-'a');
            alpha[scount]++;
            alpha[tcount]--;
        }
        return Arrays.equals(alpha, new int[26]);
    }
}
