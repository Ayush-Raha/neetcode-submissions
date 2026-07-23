class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupl = new HashSet<>();
        for(int n : nums){
            if (dupl.contains(n))
                return true;
        dupl.add(n);
        }
        return false;
    }
}