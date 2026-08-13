class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupl = new HashSet<>();
        for(int i : nums){
            if(dupl.contains(i))
                return true;
            dupl.add(i);
        }return false;
    }
}